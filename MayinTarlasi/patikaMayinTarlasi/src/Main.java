import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen satir sayisini giriniz : ");
        int row = input.nextInt();
        System.out.print("Lutfen sutun sayisini giriniz : ");
        int column = input.nextInt();

        MineSweeper mine = new MineSweeper(row, column);

        mine.run();


    }
}