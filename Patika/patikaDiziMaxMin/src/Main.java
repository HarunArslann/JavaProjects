import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = {40,26,12,-55,2,14,100,23,19,0};

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        int number = input.nextInt();

        Arrays.sort(array);

        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == number){
                System.out.println("Girilen sayidan kucuk en yakin sayi : " + array[i-1]);
                System.out.println("Girilen sayidan kucuk en yakin sayi : " + array[i+1]);
                break;
            }else if(array[i] > number){
                System.out.println("Girilen sayidan kucuk en yakin sayi : " + array[i-1]);
                System.out.println("Girilen sayidan kucuk en yakin sayi : " + array[i]);
                break;
            }
        }
    }
}