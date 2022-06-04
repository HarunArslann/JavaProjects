public class Main {

    public static void main(String[] args) {

        for(int i=999998; i>1 ; i--){
            if(isPalindrome(i) && is3Digits(i)){
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean isPalindrome(int number){

        String str = "" + number;
        for (int i = 0 ; i<(str.length())/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static boolean is3Digits(int number){

        for (int i=100; i<1000; i++){
            if(number % i == 0 && (number / i) > 100 && (number / i) < 1000){
                return true;
            }
        }
        return false;
    }
}