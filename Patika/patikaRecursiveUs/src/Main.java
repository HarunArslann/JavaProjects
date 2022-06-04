import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen taban sayisini giriniz : ");
        int a = input.nextInt();
        System.out.println("Lutfen us sayisini giriniz : ");
        int b = input.nextInt();

        System.out.println("Sonuc : " + power(a,b));
    }
    public static int power(int a, int b){
        if(b == 0){
            return 1;
        }
        return power(a,b-1) * a;
    }
}