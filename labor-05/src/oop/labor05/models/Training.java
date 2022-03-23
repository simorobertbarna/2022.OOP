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
    private ArrayList<Student> enrolledStudent = new ArrayList<>();

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

   public boolean enroll(Student student){
       if(findStudentById(student.getID()) == null){
           enrolledStudent.add(student);
           return true;
       }
       return false;

    }

    public Student findStudentById(String ID){
        Student notFound = new Student("NULL", "NULL", "NULL");
        for(int i=0; i<enrolledStudent.size(); i++){
            if(enrolledStudent.get(i).getID().equals(ID)){
                return enrolledStudent.get(i);
            }
        }
        return notFound;
    }

    public Course getCourse() {

        return course;
    }

    public int numEnrolled(){
        return this.enrolledStudent.size();
    }

    public void printToFile() {
        String fileName = String.format("%s_%s_%s.csv", course.getName(), startDate, endDate);
        try (PrintStream printStream = new PrintStream(fileName)) {
            for (int i = 0; i < enrolledStudent.size(); i++) {
                printStream.println(enrolledStudent.get(i));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void unEnroll(String ID){
        for(int i=0; i<enrolledStudent.size(); i++){
            if(enrolledStudent.get(i).getID().equals(ID)){
                enrolledStudent.remove(enrolledStudent.get(i));
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nTraining{" +
                "\n\tcourse=" + course +
                "\n\tstartDate= " + "year: "+ startDate.getYear() + " month: " + startDate.getMonth() + " day: " + startDate.getDay() +
                "\n\tendDate=" + "year: "+ endDate.getYear() + " month: " + endDate.getMonth() + " day: " + endDate.getDay() +
                "\n\tpricePerStudent=" + pricePerStudent);
        for(int i=0; i<enrolledStudent.size(); i++){
            result.append("\n\t\t" + enrolledStudent.get(i) + "");
        }
        result.append("\n}");
        return result.toString();
    }
}
