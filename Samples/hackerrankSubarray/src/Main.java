import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int lenght = input.nextInt();

        int[] array = new int[lenght];

        for(int i = 0 ; i < array.length ; i++){
            array[i] = input.nextInt();
        }
        int count = 0;

        for(int i = 1 ; i <= array.length ; i++){
            for(int j = 0 ; j <= array.length - i ; j++){
                int[] newArray = Arrays.copyOfRange(array,j,j+i);

                if(isNegative(newArray)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isNegative(int[] array){
        int total = 0;

        for(int i=0 ; i < array.length ; i++){
            total += array[i];
        }

        return total < 0;
    }
}