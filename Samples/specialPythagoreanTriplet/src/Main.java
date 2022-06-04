import java.util.Random;

public class Main {
    public static void main(String[] args) {

        for(int i=1; i<331; i++){
            for(int j=i+1; j<999; j++){
                for(int k=j+1; k<1000; k++){
                    if (isEquals(i, j, k) && isPythagorean(i, j, k)) {
                        System.out.println(i*j*k);
                        break;
                    }
                }
            }
        }



    }

    public static boolean isEquals(int a, int b, int c){

        if(a + b + c == 1000) {
            return true;
        }

        return false;
    }

    public static boolean isPythagorean(int a, int b, int c){

         if (a*a + b*b == c*c) {
             return true;
         }

         return false;
    }
}