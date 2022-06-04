import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int n = input.nextInt();
        System.out.println("Bir sayi giriniz : ");
        int r = input.nextInt();

        int divisor = 1;
        int count = 1;

        while (count < n || count < r){
            if(n % count == 0 && r % count == 0){
                divisor = count;
            }
            count++;
        }
        System.out.println("Girilen sayilarin EBOB degeri : " + divisor);

        int ekok = (n*r)/divisor;
        System.out.println("Girilen sayilarin EKOK degeri : " + ekok);
    }
}