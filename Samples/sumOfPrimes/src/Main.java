import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.printf("Bir deger giriniz : ");
        int bound = input.nextInt();
        System.out.println(totalPrimes(bound));


    }

    public static boolean isPrime(int number){

        for(int i=2; i<(int)Math.sqrt(number) + 1; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static long totalPrimes(int bound){

        long totalPrimes = 2;

        for(int i=3 ; i<bound; i++){
            if(isPrime(i)){
                totalPrimes += i;
            }
        }

        return totalPrimes;
    }
}