public class Main {
    public static String queue = ".";

    public static void main(String[] args) {

        System.out.println(concat(1000000));

    }
    public static int concat(int number){

        if(number == 1){
            return 1;
        }

        for(int i = (1000000/number) ; i < (10000000 / number ) ; i++){
            if(queue.length() > 1000000){
                break;
            }
            queue += i;
        }

        return concat(number/10) * ((queue.charAt(number)-48));
    }
}