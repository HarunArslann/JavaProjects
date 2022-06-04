public class Main {
    public static void main(String[] args) {

        int maxNumber = 0;
        int product = 1;

        for(int i = -1000 ; i < 1000 ; i++){
            for(int j = -1000 ; j <= 1000 ; j++){
                if(findPrimesNumber(i,j) > maxNumber){
                    maxNumber = findPrimesNumber(i,j);
                    product = i*j;
                    System.out.println(product + "     " + maxNumber);
                }
            }
        }
        System.out.println(product);
    }
    public static int findPrimesNumber(int a, int b){

        int total = 0;

        for(int i = 0 ; ; i++) {
            int n = i * i + a * i + b;
            if (n > 0 && isPrime(n)) {
                total++;
            }else{
                break;
            }
        }
        return total;
    }
    public static boolean isPrime(int number){

        for(int i = 2 ; i < number ; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}