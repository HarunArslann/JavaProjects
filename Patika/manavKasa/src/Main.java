import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç kg Armut : ");
        int armutKg = input.nextInt();

        System.out.print("Kaç kg Elma : ");
        int elmaKg = input.nextInt();

        System.out.print("Kaç kg Domates : ");
        int domatesKg = input.nextInt();

        System.out.print("Kaç kg Muz : ");
        int muzKg = input.nextInt();

        System.out.print("Kaç kg Patlıcan : ");
        int patlicanKg = input.nextInt();

        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5;
        double toplamTutar = armutFiyat*armutKg + elmaFiyat*elmaKg + domatesFiyat*domatesKg + muzFiyat*muzKg + patlicanFiyat*patlicanKg;

        System.out.println("Toplam Tutar : " + toplamTutar);

    }
}