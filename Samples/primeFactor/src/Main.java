public class Main {
    public static void main(String[] args) {

        for (long i = 146692255; i>0 ;i--){
            if(600851475143l % i == 0){
                if (isPrime(i)){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
    public static boolean isPrime(long number){

        for(long i=3; i<number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}