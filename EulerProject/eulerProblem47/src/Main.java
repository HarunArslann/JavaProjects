import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {




        for(int i = 100000 ; i < 1000000 ; i++){
            if(isConsecutive(consecutives(i))){
                System.out.println(i);
                break;
            }
        }


    }
    private static int[] consecutives(int start){

        return IntStream.range(start,start + 4).parallel().map(Main::consNumbers).toArray();

    }
    private static int consNumbers(int n){

        return n;

    }
    private static boolean isConsecutive(int[] list){

        for(int number : list){
            ArrayList<Integer> primeFactors = findPrimeFactors(number);
            if(primeFactors.size() == 4){
                System.out.println(number + "   " + primeFactors);
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    private static ArrayList<Integer> findPrimeFactors(int n){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 2 ; i < Math.sqrt(n) * 2; i++){
            if(n % i == 0 && isPrime(i)){
                list.add(i);
            }
        }
        return list;
    }

    private static boolean isPrime(int val){

        if(val == 2){
            return true;
        }
        for(int i = 2 ; i < Math.sqrt(val) + 1 ; i++){
            if(val % i == 0){
                return false;
            }
        }
        return true;
    }

}