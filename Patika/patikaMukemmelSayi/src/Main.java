import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz : ");
        int sayi = input.nextInt();
        int total = 0;

        for(int i=1; i<sayi; i++){
            if(sayi%i == 0) {
                total += i;
            }
        }
        if(sayi == total){
            System.out.println(sayi + " mukemmel bir sayidir.");
        }else {
            System.out.println(sayi + " mukemmel bir sayi değildir.");
        }
    }
}