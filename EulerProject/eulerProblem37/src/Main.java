public class Main {

    private static final int LIMIT = 1000000;

    public static void main(String[] args) {

        System.out.println(findTruncatableNumbers(LIMIT));

    }
    public static int findTruncatableNumbers(int limit){

        int total = 0;

        for(int i = 10 ; i < limit ; i++){
            if(isTruncatable(i)){
                System.out.println(i);
                total += i;
            }
        }

        return total;

    }
    public static boolean isTruncatable(int number){

        int value = number;

        while(number > 0){
            if(!isPrime(number)){
                return false;
            }
            number = number / 10;
        }


        while(value > 0){
            if(!isPrime(value)){
                return false;
            }
            value = getReverse(value);
            value = value / 10;
            value = getReverse(value);
        }

        return true;
    }

    public static boolean isPrime(int number){

        if(number <= 1){
            return false;
        }

        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int getReverse(int number){

        String strNumber = String.valueOf(number);
        String reverse = "";

        for(int i = 0 ; i < strNumber.length() ; i++){
            reverse += strNumber.charAt(strNumber.length() - i - 1);
        }

        return Integer.parseInt(reverse);
    }
}