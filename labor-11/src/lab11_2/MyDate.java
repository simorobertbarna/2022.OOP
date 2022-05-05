package lab11_2;

public class MyDate implements Comparable<MyDate>{
        private final int day;
        private final int month;
        private final int year;

    public MyDate(int year, int month, int day) throws InvalidDateException{
        if(DateUtil.isValidDate(year,month, day)){
            throw new InvalidDateException("INVALID DATE");
        }
            this.year=year;
            this.month=month;
            this.day=day;


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
