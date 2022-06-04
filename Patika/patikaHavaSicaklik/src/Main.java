import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik giriniz : ");
        heat = input.nextInt();

        if(heat <= 5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if(heat <= 15 ){
            System.out.println("Sinema yapabilirsiniz.");
        }else if(heat <= 25){
            System.out.println("Piknik yapabilirsiniz.");
        }else{
            System.out.println("Yuzme yapabilirsiniz.");
        }
    }
}