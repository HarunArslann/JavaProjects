import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int total = 0;

        do {
            System.out.println("Lutfen bir sayi giriniz : ");
            number = input.nextInt();

            if(number % 4 == 0){
                total += number;
            }
        } while (number % 2 == 0);

        System.out.println(total);

    }
}