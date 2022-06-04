import java.util.*;
import java.io.*;

    public static String SearchingChallenge(String str) {

        String[] words = str.split(" ");
        String result ;
        ArrayList<HashMap<Character, Integer>> wordMapList = new ArrayList<HashMap<Character, Integer>>();

        for(String word: words){
            HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
            String lowerWord = word.toLowerCase();

            for(char letter: lowerWord.toCharArray()){

                if (myMap.get(letter) == null){
                    myMap.put(letter, 1);
                }else{
                    myMap.put(letter, myMap.get(letter) + 1);
                }

            }
            wordMapList.add(myMap);
        }
        if (noneRepeatedLetter(wordMapList)){
            return "-1";
        }

        return words[mostRepeatedWordIndex(wordMapList)];
    }

    public static boolean noneRepeatedLetter(ArrayList<HashMap<Character, Integer>> wordMapList){

        for (HashMap<Character, Integer> myMap : wordMapList) {
            for (Map.Entry<Character,Integer> set : myMap.entrySet()){
                if(set.getValue() > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int mostRepeatedWordIndex(ArrayList<HashMap<Character, Integer>> wordMapList){

        int repeatCount = 1;
        int index = 0;

        for (HashMap<Character, Integer> myMap : wordMapList) {
            for (Map.Entry<Character,Integer> set : myMap.entrySet()){
                if(set.getValue() > repeatCount) {
                    repeatCount = set.getValue();
                    index = wordMapList.indexOf(myMap);
                }
            }
        }
        return index;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }

