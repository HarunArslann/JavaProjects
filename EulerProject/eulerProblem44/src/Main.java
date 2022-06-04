import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int valueD = minimizedPentagonals();
        System.out.println(valueD);


    }

    private static int pentagonal(int value){

        return value * (3 * value - 1) / 2;
    }

    private static int minimizedPentagonals(){

        int[] array = pentagonals();
        int result = 0;
        boolean stopOuter = true;

        for(int index = 0 ; index < array.length && stopOuter ; index++){
            for(int sIndex = index + 1 ; sIndex < array.length ; sIndex++){
                if(isPentagonal(array[sIndex] - array[index]) && isPentagonal(array[sIndex] + array[index])){
                    result = Math.abs(array[sIndex] - array[index]);
                    stopOuter = false;
                    System.out.println(sIndex - index);
                    break;
                }
            }
        }

        return result;
    }

    private static int[] pentagonals(){
        final var LIMIT = 2168;
        return IntStream.range(1,LIMIT).parallel().map(Main::pentagonal).toArray();
    }

    private static boolean isPentagonal(int number){

        double n = (1 + Math.sqrt((1+24*number))) / 6;

        return n == (int) n;
    }
}