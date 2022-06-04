import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayisini giriniz : ");
        int step = input.nextInt();

        for(int i = step ; i > 0 ; i--){
            for(int k = 0 ; k < step - i ; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < (i*2)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}