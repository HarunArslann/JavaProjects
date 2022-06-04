public class Main {
    public static void main(String[] args) {

        for(int i = 3 ; i < 1000000 ; i++){
            if(isCurious(i)){
                System.out.println(i);
            }
        }
    }

    public static long getFactorial(int number){

        int fact = 1;
        for(int i = 1 ; i <= number ; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static boolean isCurious(int number){

        long total = 0;

        for(int i = 0 ; i < Integer.toString(number).length() ; i++){

            total = total + getFactorial(Integer.parseInt(String.valueOf(String.valueOf(number).charAt(i))));
        }
        if(total == number){
            return true;
        }

        return false;
    }
}