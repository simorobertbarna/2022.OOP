package oop.labor02.date;

public class MyDate {
        private int day;
        private int month;
        private int year;

    public MyDate(int year,int month,int day){
        if(DateUtil.isValidDate(year,month, day)){
            this.year=year;
            this.month=month;
            this.day=day;
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
