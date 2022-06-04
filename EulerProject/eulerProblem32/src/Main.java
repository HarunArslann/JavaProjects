import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 1 ; i < 2000 ; i++){
            for(int j = 1 ; j < 500 ; j++){
                if(isNineDigits(i , j)){
                    int product = i*j;
                    if(!arrayList.contains(product)){
                        System.out.println(i + "   " + j + "   " +   "   " + product);
                        arrayList.add(product);
                    }
                }
            }
        }
        int total = 0;

        for(int number : arrayList){
            total += number;
        }
        System.out.println(total);

    }
    public static boolean isNineDigits(int a, int b){

        int product = a * b;

        return ("" + product + a + b).length() == 9 && isRepeated(a,b);
    }

    public static boolean isRepeated(int a, int b){
        int product = a * b;

        String total = "" + a + b + product;

        for(int i=0 ; i < total.length()-1 ; i++){
            for(int j = i+1 ; j < total.length(); j++){
                if(total.charAt(i) == total.charAt(j)){
                    return false;
                }
            }
        }
        for(int i = 1; i < 10 ; i++){
            if(!total.contains(String.valueOf(i))){
                return false;
            }
        }
        return true;
    }

}