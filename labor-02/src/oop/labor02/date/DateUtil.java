package oop.labor02.date;

public class DateUtil {
    public static boolean leapYear(int year){
        if(((year%4==0 ) && (year%100 != 0 )) || (year % 400 ==0)){
            return true;
        } else{
            return false;
        }
    }

    public static boolean isValidDate(int year, int month, int day){
        boolean valid=true;
        if(year<1 || year>2022){
            return false;
        }

        if(month<1 || month>12){
            return false;
        }

        if(day<1 || day>31){
            return false;
        }

        //februar ,szokoev
        if(month==2){
            if(leapYear(year)==true && day==29){
                return true;
            }else if(day>0 && day<=28){
                return true;
            }else{
                return false;
            }

        }

        if(month==4 || month==6 || month==9 || month==11){
            if(day<=30){
                return true;
            }else{
                return false;
            }
        }

        return valid;
    }

}
