import java.math.BigInteger;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<BigInteger> arrayList = new ArrayList<>();

        for(int i = 2; i <= 100 ; i++){
            for(int j = 2 ; j <= 100 ; j++){
                BigInteger number = BigInteger.valueOf(i).pow(j);
                if(!arrayList.contains(number)){
                    arrayList.add(number);
                }
            }
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.size());
    }
}