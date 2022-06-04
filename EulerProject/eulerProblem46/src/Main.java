import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {




        int goldbachNumber = findGoldbach();
        System.out.println(goldbachNumber);




    }
    private static int findGoldbach(){

        int number = 101;
        boolean loop = true;

        while(loop){

            int[] list = divides((int) Math.sqrt(number / 2.0) + 1);

            for (int i = 0 ; i < list.length ; i++) {
                int remainder = number - list[i];
                if (isPrime(remainder)) {
                    System.out.println(number + " - " + list[i] + " = " + remainder + "---> sayisi asaldir. ");
                    break;
                }
                if(i == list.length - 1){
                    loop = false;
                }
            }
            number += 2;
        }

        return number - 2;

    }

    private static int[] divides(int LIMIT){

        return IntStream.range(0,LIMIT).parallel().map(Main::divideCreator).toArray();

    }
    private static int divideCreator(int n){

        return 2 * n * n;

    }

    private static boolean isPrime(int val){

        for(int i = 2 ; i < val  ; i++){
            if(val % i == 0){
                return false;
            }
        }
        return true;
    }
}