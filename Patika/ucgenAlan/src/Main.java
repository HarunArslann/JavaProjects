import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("A kenarini giriniz : ");
        int a = input.nextInt();

        System.out.print("B kenarini giriniz : ");
        int b = input.nextInt();

        System.out.print("C kenarini giriniz : ");
        int c = input.nextInt();

        int u = (a+b+c)/2;

        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Ucgenin alani : " + alan);

    }
}