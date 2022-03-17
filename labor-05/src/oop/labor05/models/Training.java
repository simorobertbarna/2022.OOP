package oop.labor05.models;

import oop.labor02.date.MyDate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;


public class Training {

    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private final double pricePerStudent;
    private final ArrayList <Student> enrolledStudents = new ArrayList<Student>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public boolean enroll(Student student){



    }

    public Student findStudentById(String ID){

        for( Student student:enrolledStudents){
            if(student.getID() == ID){

            }
        }

    }

    public Course getCourse(){

    }

    public int numEnrolled(){

    }

    public void printToFile(){

        String fileName = String.format("%s_%s_%s.csv", course.getName(), startDate, endDate);
        try(PrintStream printStream = new printStream(fileName)) {

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public void unEnroll(String enrolledStudents){

    }


    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }
}

