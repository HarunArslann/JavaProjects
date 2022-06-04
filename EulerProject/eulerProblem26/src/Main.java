import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        int max = 0;

        for(int i=1 ; i<1000 ; i++){
            if(recurringNum(i) > max){
                max = i;
            }
        }
        System.out.println(max);
    }

    public static int recurringNum(int num) {
        int[] arr = new int[num + 1];
        int index = 1;
        int mod = 1;
        while (mod != 0 && arr[mod] == 0) {
            arr[mod] = index++;
            mod = (mod * 10) % num;
        }
        if (mod == 0) {
            return 0;
        }

        return index - arr[mod];
    }
}