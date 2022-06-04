public class Main {
    public static void main(String[] args) {

        long minValue = findMinValue();
        System.out.println(minValue);

    }
    private static long findMinValue(){

        long value = 40756;

        while(true){

           if(isTriangle(value) && isPentagonal(value) && isHegzagonal(value)){
               return value;
           }
           value++;
        }

    }
    private static boolean isTriangle(long val){

        double value = (Math.sqrt(1 + 8 * val) - 1) / 2 ;

        return value == (long) value;
    }
    private static boolean isPentagonal(long val){

        double value = (Math.sqrt(1 + 24 * val) + 1) / 6 ;

        return value == (long) value;
    }
    private static boolean isHegzagonal(long val){

        double value = (Math.sqrt(1 + 8 * val) + 1) / 4 ;

        return value == (long) value;
    }
}