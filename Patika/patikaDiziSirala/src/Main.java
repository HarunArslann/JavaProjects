import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Dizinin boyutunu giriniz : ");
        int index = input.nextInt();

        int[] array = new int[index];

        for(int i = 0 ; i < array.length ; i++){
            System.out.println("Dizinin " + (i+1) + ". elemanini giriniz : ");
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}