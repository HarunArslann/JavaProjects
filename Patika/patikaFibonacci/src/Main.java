import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 1, backup, prevFib = 0 ,fib = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int step = input.nextInt();

        System.out.println(0);

        while(count < step){
            System.out.println(fib);

            backup = fib;
            fib += prevFib;
            prevFib = backup;
            count++;
        }
    }
}