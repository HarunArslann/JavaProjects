public class Main {
    public static void main(String[] args) {


        for(int i = 999999999 ; i > 1 ; i--){

            if(isNotRepeated(String.valueOf(i)) && isPrime(i) && maxDigit(i) == String.valueOf(i).length()){
                System.out.println(i);
                break;
            }

        }

    }

    public static int maxDigit(int number){
        int maxDigits = 0;

        while (number > 0){
            if(number % 10 > maxDigits){
                maxDigits = number % 10;
            }
            number = number / 10;

        }
        return maxDigits;
    }

    public static boolean isPrime(int number){

        for(int i = 2 ; i < Math.sqrt(number) ; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isNotRepeated(String number){

        if(number.contains("0")){
            return false;
        }

        for(int i = 0 ; i < number.length() - 1; i++){
            for(int j = i + 1 ; j < number.length() ; j++){
                if(number.charAt(i) == number.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}