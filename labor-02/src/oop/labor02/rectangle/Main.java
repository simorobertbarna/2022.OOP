package oop.labor02.rectangle;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        double totalArea=0; double totalPerimeter=0;
        Rectangle[] rectangles = new Rectangle[10];
        for (int i = 0; i < 10 ; i++) {
            Random rand = new Random();
            double length = 1 + rand.nextInt(100);
            double width = 1 + rand.nextInt(100);
            rectangles[i] = new Rectangle(length, width);
            System.out.println("Length: "+rectangles[i].getLength());
            System.out.println("Width: "+rectangles[i].getWidth());
            System.out.println("Area: " +rectangles[i].area());
            System.out.println("Perimeter: " +rectangles[i].perimeter()+ "\n");
            totalPerimeter += rectangles[i].perimeter();
            totalArea += rectangles[i].area();
        }
        System.out.println("Total area: " + totalArea);
        System.out.println("Total perimeter: " + totalPerimeter);
    }
}
