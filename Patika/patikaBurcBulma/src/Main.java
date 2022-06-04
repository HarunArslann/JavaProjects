import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dogdugunuz ay (1 ile 12 arasinda sayi giriniz): ");
        int month = input.nextInt();

        if(month == 1){
            System.out.println("Dogdugunuz gun (1 ile 31 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 20){
                System.out.println("Oglak Burcu");
            }else{
                System.out.println("Kova Burcu");
            }
        }else if(month == 2){
            System.out.println("Dogdugunuz gun (1 ile 28 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 19){
                System.out.println("Kova Burcu");
            }else{
                System.out.println("Balik Burcu");
            }
        }else if(month == 3){
            System.out.println("Dogdugunuz gun (1 ile 31 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 20){
                System.out.println("Balik Burcu");
            }else{
                System.out.println("Koc Burcu");
            }
        }else if(month == 4){
            System.out.println("Dogdugunuz gun (1 ile 30 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 20){
                System.out.println("Koc Burcu");
            }else{
                System.out.println("Boga Burcu");
            }
        }else if(month == 5){
            System.out.println("Dogdugunuz gun (1 ile 31 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 20){
                System.out.println("Boga Burcu");
            }else{
                System.out.println("Ikizler Burcu");
            }
        }else if(month == 6){
            System.out.println("Dogdugunuz gun (1 ile 30 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 22){
                System.out.println("Ikizler Burcu");
            }else{
                System.out.println("Yengec Burcu");
            }
        }else if(month == 7){
            System.out.println("Dogdugunuz gun (1 ile 31 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 22){
                System.out.println("Yengec Burcu");
            }else{
                System.out.println("Aslan Burcu");
            }
        }else if(month == 8){
            System.out.println("Dogdugunuz gun (1 ile 31 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 23){
                System.out.println("Aslan Burcu");
            }else{
                System.out.println("Basak Burcu");
            }
        }else if(month == 9){
            System.out.println("Dogdugunuz gun (1 ile 30 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 23){
                System.out.println("Basak Burcu");
            }else{
                System.out.println("Terazi Burcu");
            }
        }else if(month == 10){
            System.out.println("Dogdugunuz gun (1 ile 31 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 23){
                System.out.println("Terazi Burcu");
            }else{
                System.out.println("Akrep Burcu");
            }
        }else if(month == 11){
            System.out.println("Dogdugunuz gun (1 ile 30 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 22){
                System.out.println("Akrep Burcu");
            }else{
                System.out.println("Yay Burcu");
            }
        }else if(month == 12){
            System.out.println("Dogdugunuz gun (1 ile 31 arasinda sayi giriniz): ");
            int day = input.nextInt();
            if(day <= 21){
                System.out.println("Yay Burcu");
            }else{
                System.out.println("Oglak Burcu");
            }
        }
    }
}