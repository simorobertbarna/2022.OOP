package oop.labor02.date;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        int error=0, year, month, day;
        MyDate date[] = new MyDate[1000];
        Random rand = new Random();
        for (int i = 0; i < 1000 ; i++) {
            year =  0 + rand.nextInt(2022-0);
            month = 1 + rand.nextInt(13-1);
            day = 1 + rand.nextInt(28);
            date[i] = new MyDate(year, month, day);
            if(DateUtil.isValidDate(year, month, day)) {
                System.out.print(" Year:"+date[i].getYear());
                System.out.print(" Month:"+date[i].getMonth());
                System.out.println(" Day:"+date[i].getDay());
                System.out.print( date[i].toString() + "\n");
                System.out.println();
            }
            else{
                ++error;
            }
        }
        System.out.println("False dates:" +error);
    }
}