import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Sayi giriniz : ");
        int number = input.nextInt();
        System.out.println(factorial(number));
        System.out.println(totalDigits(factorial(number)));

    }

    public static int totalDigits(BigInteger fact){

        String toStr = fact.toString();
        int value = 0;

        for(int i=0 ; i<toStr.length() ; i++){

        value += Integer.parseInt(String.valueOf(toStr.charAt(i)));

        }

        return value;

    }

    public static BigInteger factorial(int number){

        BigInteger fact = new BigInteger(String.valueOf(1));

        for(int i = 1; i<= number; i++){

            fact = fact.multiply(BigInteger.valueOf(i));

        }
        return fact;
    }


}