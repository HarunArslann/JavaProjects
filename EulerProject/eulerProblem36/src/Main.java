public class Main {
    public static void main(String[] args) {

        long total = 0;
        for(int i = 1 ; i < 1000000; i++){

            String harun = Integer.toBinaryString(i);

            if(isPalindrome(harun) && isPalindrome(String.valueOf(i))){

                total += i;
            }
        }
        System.out.println(total);


    }
    public static boolean isPalindrome(String number){

        String str = "" + number;
        for (int i = 0 ; i<(str.length())/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

}