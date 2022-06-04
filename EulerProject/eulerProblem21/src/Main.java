public class Main {
    public static void main(String[] args) {

        int totalAmicables = 0;

        for(int i=2 ; i<10000 ; i++){
            int a = totalDivisors(i);
            int b = totalDivisors(a);

            if (i == b && i !=a) {
                System.out.println(i + " " + a);
                totalAmicables += i + a;
            }
        }
        System.out.println(totalAmicables/2);
    }

    public static int totalDivisors(int number){

        int total = 0;

        for(int i=1 ; i<=number/2 ; i++){
            if(number % i == 0){
                total += i;
            }
        }
        return total;

    }


}
