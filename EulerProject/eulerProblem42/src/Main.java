import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\ASUS\\Desktop\\p042_words.txt");

        Scanner reader = new Scanner(file);

        String text = reader.nextLine();

        String[] newText = text.split(",");

        int total = 60;
        int count = 0;

        for(String word : newText){
            for(int i = 0 ; i < word.length() ; i++){

                total += (word.charAt(i) - 'A' + 1);
            }
            if(isTriangle(total)){
                System.out.println(word + "   " + total);
                count++;
            }
            total = 60;
        }
        System.out.println(count);
    }

    public static boolean isTriangle(int number){

        int n = (int) (Math.sqrt(number*2));

        return n*(n+1) == number*2;
    }
}