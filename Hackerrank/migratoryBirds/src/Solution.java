import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here

        int max = 0;
        int value = 0;

        ArrayList<Integer> list = new ArrayList<>();

        Collections.sort(arr);

        for(int i = 0 ; i < arr.size() ; i++){

            int count = 0;

            if(!list.contains(arr.get(i))){
                list.add(arr.get(i));
                for(int j = 0 ; j < arr.size() ; j++){
                    if(arr.get(i) == arr.get(j)){
                        count++;
                    }
                }
                if(count > max){
                    max = count;
                    value = arr.get(i);
                }
            }

        }

        return value;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.migratoryBirds(arr);

        System.out.println(result);
    }
}