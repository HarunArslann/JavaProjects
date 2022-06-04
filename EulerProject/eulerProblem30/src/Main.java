public class Main {
    public static void main(String[] args) {

        for(int i = 1 ; ;i++){
            if(isEqual5thPower(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isEqual5thPower(int number){
        int total = 0;

        int value = number;
        while(value > 0){
            total = total + (int) Math.pow(value%10,5);
            value = value / 10;
        }
        if(total == number){
            return true;
        }
        return false;
    }
}