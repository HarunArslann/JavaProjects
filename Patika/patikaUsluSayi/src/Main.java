import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Taban sayisini giriniz : ");
        int n = input.nextInt();

        System.out.println("Us sayisini giriniz : ");
        int r = input.nextInt();

        int product = 1;

        for(int i = 0 ; i < r ; i++ ){
            product *= n;
        }
        System.out.println(product);
    }
}