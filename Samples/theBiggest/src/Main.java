public class Main {
    public static void main(String[] args) {

        int sayi1 = 428;
        int sayi2 = 691;
        int sayi3 = 75934;

        int theBiggest = sayi1;

        if (theBiggest < sayi2) {
            theBiggest = sayi2;
        }

        if (theBiggest < sayi3){
            theBiggest = sayi3;
        }
        System.out.println("En buyuk sayi = " + theBiggest);
    }
}