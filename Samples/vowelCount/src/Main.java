import java.util.Scanner;

public class Main {

    private static final String vowels = "AEIOUaeiou";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(vowelCount(input.nextLine()));

    }

    public static int vowelCount(String str){
        int value = 0;

        for(int i = 0 ; i < str.length() ; i++){
            if(vowels.contains(String.valueOf(str.charAt(i)))){
                value++;
            }
        }


        return value;
    }
}