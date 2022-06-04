import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Elmasin boyutunu giriniz : ");
        int n = input.nextInt();

        for(int i = 1 ; i <= n/2 + 1 ; i++){
            for(int j = 0 ; j < n/2 - i+1; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k < 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n/2 ; i >= 1 ; i--){
            for(int j = 0 ; j < n/2 - i+1; j++){
                System.out.print(" ");
            }
            for(int k = 0 ; k < 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}