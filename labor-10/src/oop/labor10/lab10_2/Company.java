package oop.labor10.lab10_2;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {

    private final String name;
    ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        this.name = name;
        this.employees = employees;
    }


    public String getName(){
        return name;
    }

    public void hire(Employee emp) {
        if(!employees.contains(emp)){
            employees.add(emp);
        }
    }

    public void fire(int ID){

        for (int i = 0; i < employees.size(); i++) {

        }

    }

    public void printAll(PrintStream printStream){
        for(Employee e: employees){
            printStream.println(e);
        }
    }

    void sortByComparator(Comparator<Employee> employeeComparator){

        //Collections.sort(employees, employeeComparator);
        employees.sort(employeeComparator); //ArrayList sort hasznalhato
    }


}
