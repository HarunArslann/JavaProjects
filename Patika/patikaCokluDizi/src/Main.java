import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Harfin buyuklugunu giriniz : ");
        int size = input.nextInt();

        String[][] letterB = new String[size][(size/2)+1];

        for(int i = 0 ; i < letterB.length ; i++){
            if( i == 0 || i == size / 2 || i == size-1 ){
                for(int j = 0 ; j < letterB[0].length ; j++) {
                        letterB[i][j] = "* ";
                }
            }else{
                letterB[i][0] = "*";
                for(int j = 1 ; j < letterB[0].length ; j++){
                    letterB[i][j] = "  ";
                }
                letterB[i][letterB[0].length-1] = " *";
            }

        }

        for (String[] row : letterB){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
         }
    }
}