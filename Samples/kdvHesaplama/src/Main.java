import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir deger giriniz : ");
        double deger = input.nextInt();


        if(deger <= 1000){
            deger += deger * 0.18;
        }else{
            deger += deger * 0.08;
        }

        System.out.println("Kdv'li tutar : " + deger);
    }
}