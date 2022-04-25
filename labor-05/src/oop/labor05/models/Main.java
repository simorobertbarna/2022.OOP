package oop.labor05.models;

import oop.labor02.date.MyDate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Course>courses = readCourses("courses.csv");

        ArrayList<Student>students = readStudents("students.csv");


        Training oop = new Training(courses.get(0), new MyDate(2021, 3, 21), new MyDate(2022, 3, 25), 1500);

        Training[] trainingArray = new Training[courses.size()];

        int k=0;
        for(Course c : courses){
            Training training = new Training(c, new MyDate(2022, 3, 21), new MyDate(2022, 3, 25), (int)(Math.random() * (2000 - 1000) + 1000));
            trainingArray[k] = training;
            k++;
            while(training.numEnrolled() < 10){
                int id = (int)(Math.random() * students.size());
                training.enroll(students.get(id));
            }
            training.printToFile();

            System.out.println(training);
        }

        for(int i=0; i< students.size(); i++){
            System.out.println("\n" + students.get(i).getLastName() + " " + students.get(i).getFirstName());
            for (int j=0; j<trainingArray.length; j++){
                if(trainingArray[j].findStudentById(students.get(i).getID()) != null){
                    System.out.println("\t" + trainingArray[j].getCourse().getName() + ", " + trainingArray[j].getCourse().getDescription());
                }
            }
        }



    }
    private static ArrayList<Student> readStudents(String filename){
        ArrayList<Student> students = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String id = items[0].trim();
                String lastName = items[1].trim();
                String firstName = items[2].trim();
                students.add(new Student(id, firstName, lastName));
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }


    private static ArrayList<Course> readCourses(String filename){
        ArrayList<Course> courses = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String name = items[0].trim();
                String description = items[1].trim();
                int numHours = Integer.parseInt(items[2].trim());
                courses.add(new Course(name, description, numHours));
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }
}
