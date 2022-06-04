import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz : ");
        int birth = input.nextInt();

        switch (birth % 12) {
            case 0 -> System.out.println("Cin Zodiac Burcunuz : Maymun");
            case 1 -> System.out.println("Cin Zodiac Burcunuz : Horoz");
            case 2 -> System.out.println("Cin Zodiac Burcunuz : Köpek");
            case 3 -> System.out.println("Cin Zodiac Burcunuz : Domuz");
            case 4 -> System.out.println("Cin Zodiac Burcunuz : Fare");
            case 5 -> System.out.println("Cin Zodiac Burcunuz : Öküz");
            case 6 -> System.out.println("Cin Zodiac Burcunuz : Kaplan");
            case 7 -> System.out.println("Cin Zodiac Burcunuz : Tavşan");
            case 8 -> System.out.println("Cin Zodiac Burcunuz : Ejderha");
            case 9 -> System.out.println("Cin Zodiac Burcunuz : Yılan");
            case 10 -> System.out.println("Cin Zodiac Burcunuz : At");
            case 11 -> System.out.println("Cin Zodiac Burcunuz : Koyun");
        }
    }
}