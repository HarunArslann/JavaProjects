import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        long a = input.nextLong();
        long b = a / 2 ;


    }
    public static int isPrime(long a, long b){

        if(b == 1){
            return 1;
        }else {
            if(a % b == 0){
                return 0;
            }else {
                return isPrime(a, b - 1);
            }
        }
    }
}
