import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int total = 1000000;
        int index = 0;
        int value = 1;
        ArrayList<Integer> number = new ArrayList();

        for(int i = 0 ; i <= 9 ; i++){
            number.add(i);
        }

        while (index <= 9){

            for (int i = 1; i <= 9-index; i++) {
                    value *= i;
            }

            int a = total/value;
            System.out.println(total);

         System.out.println(number.get(a));
         number.remove(number.get(a));

            total = total - a * value;
            value = 1;
            index++;

        }
    }
}
