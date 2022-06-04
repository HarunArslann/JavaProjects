import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String str = input.nextLine();

        if(isPalindrome(str)){
            System.out.println(str + " kelimesi palindromik bir kelimedir.");
        }else{
            System.out.println("'" + str + "'"+ " kelimesi palindromik degildir.");
        }
    }

    public static boolean isPalindrome(String number){

        for (int i = 0 ; i<(number.length())/2; i++){
            if(number.charAt(i) != number.charAt(number.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}