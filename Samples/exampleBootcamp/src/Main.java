import java.util.*;
import java.lang.*;

public class Main {
    public static String SearchingChallenge(String str) {

        ArrayList<String[]> letterList = splitter(str);

        int[] maxRepeat = repeatCount(letterList);

        if(isRepeated(maxRepeat)){
            return (str.split(" ")[findIndex(maxRepeat)]);
        }else {
            return "-1";
        }
    }
    public static ArrayList<String[]> splitter(String str){

        String[] words = str.split(" ");
        ArrayList<String[]> letterList = new ArrayList<String[]>();

        for(String word:words) {
            String[] splitted = word.toLowerCase(Locale.ROOT).split("");
            letterList.add(splitted);
        }
        return letterList;
    }
    public static int[] repeatCount(ArrayList<String[]> letterList) {

        int counter = 0;

        int repeated = 1;

        int[] maxRepeat = new int[letterList.size()];

        for (String[] letters : letterList) {
            int[] letterCount = new int[letters.length];
            for (int i = 0; i < letters.length; i++) {
                for (int j = 0; j < letters.length; j++) {
                    if (Objects.equals(letters[i], letters[j])) {
                        counter++;
                    }
                }
                letterCount[i] = counter;
                counter = 0;
            }
            for (int value : letterCount) {
                if (value > repeated) {
                    repeated = value;
                }
            }
            maxRepeat[letterList.indexOf(letters)] = repeated;
            repeated = 0;
        }
        return maxRepeat;
    }
    public static boolean isRepeated(int[] maxRepeat){
        for(int i=0 ; i<maxRepeat.length ; i++) {
            if (maxRepeat[i] > 1) {
                return true;
            }
        }
        return false;
    }
    public static int findIndex(int[] maxRepeat) {
        int maxValue = 1;
        int maxIndex = 0;

        for (int i=0 ; i<maxRepeat.length ; i++){
            if(maxRepeat[i] > maxValue) {
                maxValue = maxRepeat[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz : ");
        System.out.print(SearchingChallenge(s.nextLine()));
    }
}