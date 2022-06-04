import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        BigInteger fact40 = new BigInteger(String.valueOf(1));
        BigInteger fact20 = new BigInteger(String.valueOf(1));

        for (int i = 1 ; i <= 20 ; i++){
            fact20 = fact20.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1 ; i <= 40 ; i++){
            fact40 = fact40.multiply(BigInteger.valueOf(i));
        }

        System.out.println(fact40.divide(fact20.multiply(fact20)));
    }
}