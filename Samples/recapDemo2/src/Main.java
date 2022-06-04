public class Main {
    public static void main(String[] args) {

        double[] myList = {7.2,1.3,4.3,5.6};
        double total = 0;
        double theBiggest = myList[0];

        for(double number:myList) {
            total = total + number;
            if (theBiggest < number) {
                theBiggest = number;
            }
        }
        System.out.println("Toplam = " + total);
        System.out.println("En Buyuk = " + theBiggest);
    }
}