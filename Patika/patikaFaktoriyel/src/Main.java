import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("n sayisini giriniz : ");
        int n = input.nextInt();

        System.out.println("r sayisini giriniz : ");
        int r = input.nextInt();

        while(r > n){
            System.out.println("Lutfen n sayisinden kucuk bir sayi giriniz : ");
            r = input.nextInt();
        }

        int factr = 1;
        for(int i = 1 ; i <= r ; i++){
            factr *= i;
        }

        int factdiff = 1;
        for(int i = 1 ; i <= n-r ; i++){
            factdiff *= i;
        }

        int factn = 1;
        for(int i = 1 ; i <= n ; i++){
            factn *= i;
        }

        int combination = (factn)/(factdiff*factr);

        System.out.println(n + " sayisinin " + r + " li kombinasyonu : " + combination);
    }
}