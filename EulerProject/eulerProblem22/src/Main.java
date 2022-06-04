import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        FileInputStream fstream;
        String[] str = new String[50000];
        try {
            String filePathTemp;
            filePathTemp = "C:\\Users\\ASUS\\Desktop\\p022_names.txt";
            fstream = new FileInputStream(filePathTemp);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            int x = 0;
            String strline;
            while ((strline = br.readLine()) != null) {
                x++;
                str = strline.split(",");
            }
            fstream.close();
            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Arrays.sort(str);

        int totalScore = 0;

        for(int i=0 ; i<str.length ; i++){
            str[i] = str[i].substring(1, str[i].length()-1);
            totalScore += findValue(str[i])*(i+1);
        }
        System.out.println(totalScore);
    }

    public static int findValue(String name){

        int value = 0;

        for(int i=0 ; i<name.length() ; i++){

            value += name.charAt(i) - 64;
        }
        return value;
    }

}