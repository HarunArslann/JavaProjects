import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a,b;

        System.out.print("Birinci sayiyi giriniz : ");
        a = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz : ");
        b = input.nextInt();

        System.out.print("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme\nLutfen islemi seciniz : ");
        int choose = input.nextInt();

        switch (choose){
            case 1:
                System.out.println("Sonuc : " + (a+b));
                break;
            case 2:
                System.out.println("Sonuc : " + (a-b));
                break;
            case 3:
                System.out.println("Sonuc : " + (a*b));
                break;
            case 4:
                System.out.println("Sonuc : " + (a/b));
                break;
            default:
                System.out.println("Lutfen gecerli bir islem giriniz : ");
        }
    }
}