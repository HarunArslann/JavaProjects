import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.format("%.4f", formattedDivision(num1,num2));;


    }
    public static double formattedDivision(double num1, double num2){

        return num1 / num2;
    }
}