import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz : ");
        int km = input.nextInt();

        System.out.println("Yasinizi giriniz : ");
        int age = input.nextInt();

        System.out.println("Yolculuk tipini seciniz (1-->Tek Yon , 2--->Gidis Donus");
        int type = input.nextInt();

        double total = km*0.1;
        double ageDiscount;

        if(age < 12){
            ageDiscount = total * 0.5;
            total = total - ageDiscount;
            if(type == 2){
                total = 2 * (total * 0.8);
            }
        }else if(age <= 24){
            ageDiscount = total * 0.1;
            total = total - ageDiscount;
            if(type == 2){
                total = 2 * (total * 0.8);
            }
        }else if(age > 65){
            ageDiscount = total * 0.3;
            total = total - ageDiscount;
            if(type == 2){
                total = 2 * (total * 0.8);
            }
        }

        if(km >= 0 && age >= 0 && type == 1 || type == 2){
            System.out.print("Toplam tutar : " + total);

        }else{
            System.out.println("Hatali veri girdiniz.");
        }
    }
}