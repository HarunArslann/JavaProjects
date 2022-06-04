import java.util.Scanner;

public class Main {

    public static int letterCount(String word){
        int count = 1;
        int maxRepeat = 1;

        for(int i = 0 ; i < word.length() - 1; i++){
            for(int j = i + 1 ; j < word.length() ; j++){
                if(word.charAt(j) == word.charAt(i)){
                    count++;
                }
            }
            if(count > maxRepeat){
                maxRepeat = count;
            }
            count = 1;
        }

        return maxRepeat;
    }

    public static int[] findValues(String[] words){

        int[] values = new int[words.length];

        for(int i = 0 ; i < words.length ; i++){
            values[i] = letterCount(words[i]);
        }

        return values;

    }public static int findMaxIndex(int[] values){
        int index = 0 ;
        int maxValue = 0;

        for(int i = 0 ; i < values.length ; i++){
            if(values[i] > maxValue){
                maxValue = values[i];
                index = i;
            }
        }

        for(int i = 0 ; i < values.length - 1 ; i++){
            if(values[i] != values[i+1]){
                return index;
            }
        }
        return -1;
    }

    public static String SearchingChallenge(String str) {

        if(str == "No words"){
            return "-1";
        }
        // code goes here
        String[] words = str.split(" ");

        int index = findMaxIndex(findValues(words));

        return index == -1 ? "-1" : words[findMaxIndex(findValues(words))];
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }

}