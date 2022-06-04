import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = findPrimes();

        System.out.println(chainNumber(list));

    }

    private static ArrayList<Integer> findPrimes(){

        ArrayList<Integer> primes = new ArrayList<>();

        for(int i = 2 ; i < 10000 ; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }
    private static long chainNumber(ArrayList<Integer> list){

        long maxSum = 0;
        int maxRun = 0;

        for (int i = 0; i < list.size(); i++) {  // For each index of a starting prime number
            int sum = 0;
            for (int j = i; j < list.size(); j++) {  // For each end index (inclusive)
                sum += list.get(j);
                if (sum > 1000000)
                    break;
                else if (j - i > maxRun && sum > maxSum && isPrime(sum)) {
                    maxSum = sum;
                    maxRun = j - i + 1;
                }
            }
        }

        return maxSum;
    }

    private static boolean isPrime(int val){

        if(val == 2){
            return true;
        }

        for(int i = 2 ; i <= Math.sqrt(val) ; i++){
            if(val % i == 0){
                return false;
            }
        }
        return true;
    }
}