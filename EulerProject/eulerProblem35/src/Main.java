public class Main {
    public static void main(String[] args) {

        int count = 0;

        for(int i = 2 ; i < 1000000 ; i++){
            if(isCircularPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPrime(int number){
        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean isCircularPrime(int number){
        String strNumber = Integer.toString(number);
        for(int i = 0 ; i < strNumber.length() ; i++){
            if(!isPrime(Integer.parseInt(strNumber.substring(i)+strNumber.substring(0,i)))){
                return false;
            }
        }
        return true;
    }
}