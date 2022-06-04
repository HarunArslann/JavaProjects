import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);
        System.out.println("Aklimdan bir sayi tuttum. Bulabilir misin :) Hadi bir sayi gir ve sansini dene!");


        int right = 5;

        while (right > 0){
            int prediction = input.nextInt();
            if(prediction < 0 || prediction > 100){
                System.out.println("Lutfen 0 ile 100 arasinda bir sayi gir : ");
                continue;
            }
            if(prediction == number){
                System.out.println("Tebrikler!! Bildin.");
                break;
            }else{
                right--;
                if(right == 0){
                    System.out.println("Uzgunum Kaybettin :((((");
                }
                System.out.println("Bilemedin :( ");
                if(number > prediction){
                    System.out.println("Hadi bir daha dene. Daha buyuk bir sayi gir :)");
                    System.out.println("Ama dikkat et. Yalnizca " + right + " hakkin kaldi.");
                }else{
                    System.out.println("Hadi bir daha dene. Daha kucuk bir sayi gir :)");
                    System.out.println("Ama dikkat et. Yalnizca " + right + " hakkin kaldi.");
                }
            }
        }
    }
}