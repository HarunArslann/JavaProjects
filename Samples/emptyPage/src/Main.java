import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String numbers = "0123456789";

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String number = "";

        int total = 0;

        for(int i = 0 ; i < str.length() ; i++){
            if(!numbers.contains(String.valueOf(str.charAt(i)))){
                continue;
            }else{
                while(numbers.contains(String.valueOf(str.charAt(i)))){
                    number = number + str.charAt(i);
                    i++;
                    if(i == str.length()){
                        break;
                    }
                }
                total = total + Integer.parseInt(number);
                number = "";
            }
        }
        System.out.println(total);
    }
}