package oop.labor05.models;

public class Course {

    private final String name;
    private final String descrpition;
    private final int numHours;


    public Course(String name, String descrpition, int numHours) {
        this.name = name;
        this.descrpition = descrpition;
        this.numHours = numHours;
    }

    public String getName() {
        return name;
    }

    public String getDescrpition() {
        return descrpition;
    }

    public int getNumHours() {
        return numHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", descrpition='" + descrpition + '\'' +
                ", numHours=" + numHours +
                '}';
    }
}
