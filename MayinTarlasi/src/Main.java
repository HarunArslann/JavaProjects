import java.util.Scanner;

public class Main {
    public static String LetterCapitalize(String str) {
        // code goes here
        String newStr = str.toUpperCase();
        String lastStr = "";
        int reminder = 0;

        for(int i = 0 ; i < str.length() ; i++){
            if(i == 0 ){
                lastStr = lastStr + newStr.charAt(i);
            }
            if(str.charAt(i) == ' '){
                lastStr = lastStr + str.substring(reminder+1,i+1) + newStr.charAt(i+1);
                reminder = i +1 ;
            }
            if(i == str.length()-1){
                lastStr = lastStr + str.substring(reminder+1);
            }
        }
        return lastStr;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }
}