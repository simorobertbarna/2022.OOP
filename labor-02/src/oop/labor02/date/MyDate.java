package oop.labor02.date;

public class MyDate {
        private int day;
        private int month;
        private int year;

    public MyDate(int a,int b,int c){
        if(DateUtil.isValidDate(a,b,c)){
            this.year=a;
            this.month=b;
            this.day=c;
        }else{
            System.out.println("Invalid date!");
        }

    }

    public int getYear(){
        return year;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public String toString(){
        return "Date: " + this.year + "," + this.month + "," + this.day;
    }

}
