import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String result = findPrimePerm();
        System.out.println(result);

    }

    private static String findPrimePerm(){
        String number = "";

        for(int i = 1488 ; i < 10000 - 6660 ; i++){

            if(isPrime(i)){
                int number2 = i + 3330;
                int number3 = i + 6660;
                if(perm(String.valueOf(i)).containsAll(perm(String.valueOf(number2)))  && perm(String.valueOf(number2)).containsAll(perm(String.valueOf(number3)))){
                    number = number + i + number2 + number3;
                }

            }
        }
        return number;
    }

    private static boolean isPrime(int number){

        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if(number % i == 0){
                return false;
            }
        }
        number = number + 3330;
        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if((number) % i == 0){
                return false;
            }
        }
        number = number + 3330;
        for(int i = 2 ; i <= Math.sqrt(number) ; i++){
            if((number) % i == 0){
                return false;
            }
        }
        return true;
    }

    private static ArrayList<String> perm(String number){

        ArrayList<String> numbers = new ArrayList<>();

        for(int i = 0 ; i < number.length() ; i++){
            numbers.add(String.valueOf(number.charAt(i)));
        }
        Collections.sort(numbers);

        return numbers;
    }
}