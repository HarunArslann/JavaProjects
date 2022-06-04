import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap giriniz: ");
        int r = input.nextInt();

        System.out.print("Açı giriniz: ");
        int a = input.nextInt();

        double alan = (3.14*r*r*a)/360;

        System.out.println("Daire diliminin alanı: " + alan);
    }
}