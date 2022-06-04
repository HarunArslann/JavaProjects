import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> totals = new ArrayList<>();

    public static void main(String[] args) {

        final long startTime = System.nanoTime();

        ArrayList<Integer> abundant = new ArrayList<>();

        for(int i=12 ; i<=28123 ; i++){
            if (isAbundant(i)){
                abundant.add(i);
            }
        }

        for(int i=0 ; i<= abundant.indexOf(14064) ; i++){
            for(int j=i ; j < abundant.size() - i; j++){
                totals.add(abundant.get(i)+abundant.get(j));
            }
        }
        long total = 1;

        for(int i=2 ; i < 28123 ; i++){
            if(hasValue(i)){
                total += i;
            }
        }
        System.out.println(total);
        final double duration = System.nanoTime() - startTime;
        System.out.println(duration/1000000000 + " saniye");
    }

    public static boolean isAbundant(int number){

        int total = 0;

        for(int i=number/2; i>=1 ; i--){
            if(number % i == 0){
                total += i;
            }
            if(total > number){
                return true;
            }
        }
        return false;
    }

    public static boolean hasValue(int value){

        for(int i=0 ; i<totals.size() ; i++){
            if(value == totals.get(i)){
                return false;
            }
        }
        return true;
    }
}