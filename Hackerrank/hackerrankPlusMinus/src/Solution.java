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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */



    public static String timeConversion(String s) {

        ArrayList<Integer> list = new ArrayList<>();

        list.set
        // Write your code here

        String str = s.substring(s.length() - 2);

        if(str.equals("PM")){
            int value = Integer.parseInt(s.substring(0,2));
            if(value < 12){
                value += 12;
                s = value + s.substring(2,s.length() - 2);
            }else {
                s = value + s.substring(2,s.length() - 2);
            }

        }else {
            int value = Integer.parseInt(s.substring(0,2));
            if(value < 12){
                s = value + s.substring(2,s.length() - 2);
            }else {
                value = value % 12;
                s = value + s.substring(2,s.length() - 2);
            }

        }

        return s;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        String result = Result.timeConversion(s);

        System.out.println(result);

    }
}