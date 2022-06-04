import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz : ");
        int number = input.nextInt();

        int total = 0;

        while (number != 0){
            total += (number%10);
            number = number/10;
        }

        System.out.println("Basamaklar toplami : " + total);
    }
}