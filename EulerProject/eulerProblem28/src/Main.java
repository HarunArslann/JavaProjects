public class Main {
    public static void main(String[] args) {

        int number = 1;
        int total = 1;

        for(int i=1 ; i<=500 ; i++){
            for(int j=0; j<4 ; j++){
                number = number + 2 * i;
                total += number;
            }
        }
        System.out.println(total);
    }
}