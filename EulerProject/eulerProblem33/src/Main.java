import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int denominator = 1;
        int numerator = 1;
        int x = 1;

        for(int i = 12 ; i < 99 ; i++){
            for(int j = 13 ; j < 50 ; j++){
                if(i%10 != 0 && i%11 != 0 && j%10 != 0 && j%11 != 0){
                    if(isFraction(i,j)){
                        System.out.println(i + "   " + j);
                        for(int k = 1 ; k <= j ; k++){
                            if(i % k == 0 && j % k == 0){
                                x = i / k;
                                System.out.println(x);
                            }
                        }
                        denominator *=  x;
                    }
                }
            }
        }
        System.out.println(denominator);
    }
    public static boolean isFraction(double a, double b){

        double newA , newB;

        if((int) a%10 == (int) b/10){
            newA = (int)a/10;
            newB = (int)b%10;
           // System.out.println(a + "    " + b + "    " + "    " + newA + "   " + newB + "   " + (double) newA/newB + "   "  + (double) (a/b));

            if((newA/newB) == (a/b)){
                return true;
            }
        }else if((int)a/10 == (int)b%10){
            newA = (int)a%10;
            newB = (int)b/10;
          //  System.out.println(a + "    " + b + "    " + "    " + newA + "   " + newB + "   " + (double) newA/newB + "   "  + (double) (a/b));
            if((newA/newB) == (a/b)){
                return true;
            }
        }else{
            return false;
        }
       return false;
    }
}