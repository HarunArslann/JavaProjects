import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int a = input.nextInt();

        patternDown(a,a);
    }
    public static void patternDown(int a, int b){

        if(a <= 0){
            System.out.print(a + "  ");
            patternUp(a+5,b);
        }else{
            System.out.print(a + "  ");
            patternDown(a-5,b);
        }
    }
    public static void patternUp(int a, int b){
        System.out.print(a + "  ");
        if(a == b){
            return;
        }else {
            patternUp(a+5,b);
        }
    }
}