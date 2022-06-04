import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int bound = input.nextInt();

        int total = 0;
        double average;
        int count = 0;

        for(int i = 1 ; i <= bound ; i++){
            if(i%3 == 0 || i%4 == 0){
                total += i;
                count++;
            }
        }
        average = (double) total / count;
        System.out.println(average);
    }
}