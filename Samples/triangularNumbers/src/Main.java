public class Main {
    public static void main(String[] args) {

        int number = 1;
        int pattern = 2;

        while(divisors(number) < 500){

            number = number + pattern;
            pattern++;

        }
        System.out.println(number);
    }

    public static int divisors(int number){

        int divisors = 1;

        for(int i = 1 ; i <= number/2; i++){
            if(number % i == 0){
                divisors++;
            }
        }

        return divisors;
    }

}
