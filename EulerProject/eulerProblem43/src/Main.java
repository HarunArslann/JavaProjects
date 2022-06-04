public class Main {

    private static int[] properTest = {2,3,5,7,11,13,17};
    public static void main(String[] args) {

        long total = 0;

        for(long i = 1000000000; i < 9999999999L; i++){

            if(isNotRepeated(String.valueOf(i)) && isProper(String.valueOf(i))){
                System.out.println(i);
                total += i;
            }

        }

        System.out.println(total);

    }

    public static boolean isNotRepeated(String number){

        for(int i = 0 ; i < number.length() - 1; i++){
            for(int j = i + 1 ; j < number.length() ; j++){
                if(number.charAt(i) == number.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isProper(String number){

        return (Integer.parseInt(number.substring(1,4)) % 2 == 0) && (Integer.parseInt(number.substring(2,5)) % 3 == 0) && (Integer.parseInt(number.substring(3,6)) % 5 == 0) && (Integer.parseInt(number.substring(4,7)) % 7 == 0) && (Integer.parseInt(number.substring(5,8)) % 11 == 0) && (Integer.parseInt(number.substring(6,9)) % 13 == 0) && (Integer.parseInt(number.substring(7,10)) % 17 == 0);
    }



}