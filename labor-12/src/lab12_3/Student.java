package lab12_3;

import javax.security.auth.Subject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Student {

    private final String firstName;
    private final String lastName;
    private final int id;
    private HashSet<Subject> marks = new HashSet<>();

    public Student(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }
    private HashMap<Integer, Student> students = new HashMap<>();

    public static HashMap<Integer, Student> readFromTXTFile(String fileName) {
        HashMap<Integer, Student> students = new HashMap<>();
        try (Scanner scanner = new Scanner(new File("nevek.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                // trim: eliminates leading and trailing spaces
                int id = Integer.parseInt(items[0].trim());
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                // Convert String → int: Integer.parseInt( String)

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
