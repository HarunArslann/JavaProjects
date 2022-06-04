import java.util.Arrays;
import java.util.Scanner;
public class MineSweeper {
    int row;
    int column;
    int mineNumber;
    String[][] mineField;
    String[][] copy;


    MineSweeper(int row, int column){
        this.row = row;
        this.column = column;
        this.mineField = new String[row][column];
        this.copy = new String[row][column];
    }
    void run(){
        Scanner input = new Scanner(System.in);

        System.out.print("Onerilen ----> Kolay  : " +(int) (row*column*0.1) + "\n" +
                "               Orta   : " + (int) (row*column*0.15) + "\n" +
                "               Zor    : " + (int) (row*column*0.2) +"\n" +
                "Lutfen mayin sayisini giriniz :");

        this.mineNumber = input.nextInt();
        placeMines(mineNumber);
        System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz !");
        printField(this.copy);

        while(true){
            System.out.print("Lutfen bir satir sayisi giriniz : ");
            int row = input.nextInt();
            System.out.print("Lutfen bir sutun sayisi giriniz : ");
            int column = input.nextInt();

            System.out.println("============================================");

            if(row >= this.row || column >= this.column){
                System.out.println("Yanlis giris yaptiniz. Tekrar deneyiniz.");
                printField(this.copy);
                continue;
            }

            if(this.mineField[row][column].equals("*")){
                printField(this.mineField);
                System.out.println("Mayina bastiniz. OYUN BITTI :(");
                break;
            }else{
                this.copy[row][column] = this.mineField[row][column];
                printField(this.copy);
                if(isWin()){
                    System.out.println("Tebrikler. KAZANDINIZ !");
                    break;
                }
                continue;
            }
        }
    }
    void placeMines(int mineNumber) {
        int placed = 0;

        while (placed < mineNumber) {

            int randomRow = (int) (Math.random() * this.row);
            int randomColumn = (int) (Math.random() * this.column);

            if (mineField[randomRow][randomColumn] == null) {
                mineField[randomRow][randomColumn] = "*";
                placed++;
            }
        }
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (this.mineField[i][j] == null) {
                    this.mineField[i][j] = mineCounter(i,j);
                }
            }
        }

        for(String[] arr : this.copy){
            Arrays.fill(arr,"-");
        }

    }
    void printField(String[][] field){

        for(int i = 0 ; i < this.row ; i++){
            for(int j = 0 ; j < this.column ; j++){
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    String mineCounter(int row, int column){
        int count = 0;

        for(int i=row-1 ; i<row+2 ; i++){
            for(int j=column-1 ; j<column+2 ; j++){
                if(i >= 0 && i < this.row && j >= 0 && j < this.column){
                    if(this.mineField[i][j] == null) {
                        continue;
                    }else if(this.mineField[i][j].equals("*")){
                        count++;
                    }
                }
            }
        }
        return String.valueOf(count);
    }

    boolean isWin(){
        int count = 0;

        for(String[] row : this.copy){
            for(String mine : row){
                if(mine.equals("-")){
                    count++;
                }
            }
        }
        return count == this.mineNumber;
    }
}
