import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        int count = 1;
        BigInteger backup, prevFib = BigInteger.valueOf(0),fib = BigInteger.valueOf(1);
        int index = 1;

        while(count != 1000){
            backup = fib;
            fib = fib.add(prevFib);
            prevFib = backup;
            count = digitCounter(fib);
            index++;
        }

        System.out.println(index);

    }
    public static int digitCounter(BigInteger number){

        int digit = number.toString().length();

        return digit;
    }
}