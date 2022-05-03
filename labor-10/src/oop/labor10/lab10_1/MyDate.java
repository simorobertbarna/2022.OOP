package oop.labor10.lab10_1;

public class MyDate implements Comparable<MyDate>{
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

    @Override
    public int compareTo(MyDate that) {

        if(this.year == that.year){
            if(this.month == that.month){
                return this.day - that.day;
            }
            return this.month - that.month;
        }
        return this.year - that.year;
    }
}
