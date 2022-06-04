import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {


        BigDecimal result = new BigDecimal(Math.pow(2,1000));

        System.out.println(result);
        int total = 0;

        for (int i=0 ; i<result.toBigInteger().toString().length() ; i++){

            total += Integer.parseInt(String.valueOf(result.toString().charAt(i)));

        }
        System.out.println(total);
    }
}