import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String menu = """
                1-Toplama
                2-Cikarma
                3-Carpma
                4-Bolme
                5-Uslu Sayi Hesaplama
                6-Mod Alma
                7-Dikdortgen Alan ve Cevre Hesabi
                8-Cikis Yap""";

        while(true){
            System.out.println(menu);
            System.out.print("Lutfen bir islem seciniz : ");
            int select = input.nextInt();

            System.out.println("Birinci sayiyi giriniz : ");
            int a = input.nextInt();
            System.out.println("Ikinci sayiyi giriniz : ");
            int b = input.nextInt();

            if(select == 0){
                break;
            }

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    product(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    rectangle(a,b);
                    break;
            }
        }
    }
    public static void sum(int a, int b){
        int result = a + b;
        System.out.println(result);
    }
    public static void minus(int a, int b){
        int result = a - b;
        System.out.println(result);
    }
    public static void product(int a, int b){
        int result = a * b;
        System.out.println(result);
    }
    public static void divide(int a, int b){
        int result = a / b;
        System.out.println(result);
    }
    public static void mod(int a, int b){
        int result = a % b;
        System.out.println(result);
    }
    public static void power(int a, int b){
        int result = (int) Math.pow(a,b);
        System.out.println(result);
    }
    public static void rectangle(int a, int b){
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("Dikdortgenin Alani : " + area + "\nDikdortgenin Cevresi : " + perimeter);
    }
}