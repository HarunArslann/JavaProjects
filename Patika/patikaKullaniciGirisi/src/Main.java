import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sifre giriniz : ");
        String sifre = input.nextLine();

        System.out.println("Sifrenizi tekrar giriniz : ");
        String tekrarSifre = input.nextLine();

        if(sifre.equals(tekrarSifre)){
            System.out.println("Sifreniz dogru.");
        }else {
            System.out.println("Hatali giris yaptiniz. Sifrenizi degistirmek ister misiniz? evet/hayir");
            String tercih = input.nextLine();
            switch (tercih){
                case "evet":
                    System.out.println("Lutfen yeni sifreyi giriniz : ");
                    String yeniSifre = input.nextLine();
                    while(yeniSifre.equals(sifre)){
                        System.out.println("Sifre olusturulamadi. Lutfen farkli bir sifre giriniz : ");
                        yeniSifre = input.nextLine();
                    }
                    System.out.println("Sifre olusturuldu.");
                    break;
                case "hayir" :
                    break;
            }
        }
    }
}