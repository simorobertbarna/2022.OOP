package oop.labor05.models;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Course> courses = readStudents("courses.csv".toString());
        for (int i=0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
    }

    private static ArrayList<Course> readStudents(String filename){

        ArrayList<Course> courses = new ArrayList<Course>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                String name = items[0].trim();
                String descpription = items[1].trim();
                // Convert String → int: Integer.parseInt( String)
                int numHours = Integer.parseInt(items[2].trim());
                courses.add(new Course(name, descpription, numHours));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;

    }
}
