import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz : ");
        int n = input.nextInt();

        double total = 0;

        for(int i = 1 ; i <= n ; i++){
            total += (1.0/i);
        }

        System.out.println(total);
    }
}