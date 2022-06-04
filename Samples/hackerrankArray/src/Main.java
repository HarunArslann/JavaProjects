import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int q = input.nextInt();

        for(int i = 0 ; i < q ; i++){
            int n = input.nextInt();
            int leap = input.nextInt();

            int[] game = new int[n];

            for(int j = 0 ; j < n ; j++){
                game[j] = input.nextInt();
            }
            int x = 0;
            if(isWin(leap,game,x)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }

    public static boolean isWin(int m, int[] arr, int i) {
        if (i < 0 || arr[i] == 1) return false;
        if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

        arr[i] = 1;
        return isWin(m, arr, i + 1) || isWin(m, arr, i - 1) || isWin(m, arr, i + m);
    }
}