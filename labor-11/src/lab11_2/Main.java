package lab11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File("student.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                try {
                    String neptunCode = items[0].trim();
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    int credits = Integer.parseInt(items[3].trim());
                    int birthYear = Integer.parseInt(items[3].trim());
                    int birthMonth = Integer.parseInt(items[3].trim());
                    int birthDay = Integer.parseInt(items[3].trim());

                    Student student = new Student(neptunCode,firstName,lastName, credits, birthYear, birthMonth, birthDay);
                    System.out.println(student);
                }
                catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.println("INCOMPLETE LINE: " + line );

                }catch (NumberFormatException ex){
                    System.out.println("NUMBER FORMAT EXCEPTION: " + line);
                }
                catch (InvalidDateException exc){
                    System.out.println("INVALID DATE: " + line);
                }

            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

