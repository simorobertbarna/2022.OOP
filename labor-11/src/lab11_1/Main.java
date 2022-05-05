package lab11_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me some numbers with spaces between!\n");
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                sum = sum + Double.parseDouble(numbers[i].trim());
            }catch (NumberFormatException ex){
                System.out.println("Wrong input: " + numbers + "is not a number");
            }
        }
        System.out.println("The sum: " + sum);
    }

}
