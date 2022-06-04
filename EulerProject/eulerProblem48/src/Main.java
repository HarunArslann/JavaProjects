import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        BigInteger a = BigInteger.valueOf(1000);
        String str = String.valueOf(selfPower(a));

        System.out.println(str.substring(str.length()-10));

    }
    private static BigInteger bigValue = BigInteger.valueOf(0);

    private static BigInteger selfPower(BigInteger val){

        if(val.intValue() == 1){
            return BigInteger.valueOf(1);
        }

        return bigValue.add(getPower(val,val).add(selfPower(val.subtract(BigInteger.valueOf(1)))));
    }
    private static BigInteger getPower(BigInteger val, BigInteger count){

        if(count.intValue() == 0){
            return BigInteger.valueOf(1);
        }

        return val.multiply(getPower(val,count.subtract(BigInteger.valueOf(1))));
    }
}