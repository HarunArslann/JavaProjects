public class Main {
    public static void main(String[] args) {

        int year = 1901;
        int totalSundays = 0;
        int startingDay = 2;

        while (year<=2000){
            if(isLeapYear(year)){
                for(int month = 1; month <= 12; month++){
                    if(month == 4 || month == 6 || month == 9 || month == 11){
                        startingDay += 2;
                    }else if (month != 2) {
                        startingDay += 1;
                    }else {
                        startingDay += 3;
                    }
                    if(startingDay % 7 == 0){
                        totalSundays++;
                    }
                }
            }else {
                for(int month = 1; month <= 12; month++){
                    if(month == 4 || month == 6 || month == 9 || month == 11){
                        startingDay += 2;
                    }else if (month != 2) {
                        startingDay += 0;
                    }else {
                        startingDay += 3;
                    }
                    if(startingDay % 7 == 0){
                        totalSundays++;
                    }
                }
            }
        year++;
        }

        System.out.println(totalSundays);
    }

    public static boolean isLeapYear(int year){

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }
}