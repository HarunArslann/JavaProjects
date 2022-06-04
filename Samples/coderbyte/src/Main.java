import java.util.Scanner;

public class Main {
    public static String FirstReverse(String str) {
        // code goes here
        String reverseStr = "";

        for(int i = 0 ; i < str.length() ; i++){
            reverseStr = reverseStr + (str.charAt(str.length() - i - 1));
        }
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.print(FirstReverse(str));
    }
}