public class Main {
    public static void main(String[] args) {

        for (int i = 21; i < 1000000000; i++) {
            if (isDivisible(i)) {
                System.out.println(i);
                break;
            }
        }

    }

    public static boolean isDivisible(int number){

        for(int i=1 ; i<=20 ; i++){
            if(number % i != 0){
                return false;
            }
        }
        return true;
    }
}