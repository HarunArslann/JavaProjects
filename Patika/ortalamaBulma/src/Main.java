import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mat, fiz, kim, turkce, tarih, muzik;

        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fiz = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kim = input.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = input.nextInt();

        int toplam = mat+fiz+kim+turkce+tarih+muzik;
        double ortalama = toplam / 6;


        boolean buyukMu = ortalama < 60;
        String str = buyukMu ? "Kaldınız!" : "Geçtiniz!";

        System.out.println("Not Ortalamanız : " + ortalama + "\n" + str);
    }
}