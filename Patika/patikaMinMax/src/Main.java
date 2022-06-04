import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Girilecek sayi adedi : ");
        int count = input.nextInt();

        int minValue = 0;
        int maxValue = 0;
        int number;

        for(int i = 1 ; i <= count ; i++){
            if(i == 1){
                System.out.println(i + ". sayiyi giriniz : ");
                number = input.nextInt();
                minValue = number;
                maxValue = number;

            }else{
                System.out.println(i + ". sayiyi giriniz.");
                number = input.nextInt();
                if(number < minValue){
                    minValue = number;
                }
                if(number > maxValue){
                    maxValue = number;
                }
            }
        }

        System.out.println("En kucuk sayi : " + minValue);
        System.out.println("En buyuk sayi : " + maxValue);
    }
}