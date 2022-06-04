import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int query = input.nextInt();

        for(int i = 0 ; i < query ; i++){

            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            int value = a;
            int secondValue = 0;

            for(int j = 0 ; j < n ; j++){

                secondValue = (int) (b*Math.pow(2,j));
                value += secondValue;
                System.out.print(value + " ");
                secondValue = 0;
            }
            System.out.println();
        }
    }
}