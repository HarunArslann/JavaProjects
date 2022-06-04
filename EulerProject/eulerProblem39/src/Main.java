public class Main {
    public static void main(String[] args) {

        int maxSolution = 0;
        int maxNumber = 3;

        for(int i = 3 ; i < 1000 ; i++){
            if(solutionNumber(i) > maxSolution){
                maxSolution = solutionNumber(i);
                maxNumber = i;
            }
        }
        System.out.print(maxNumber);
    }

    public static int solutionNumber(int value){

        int count = 0;

        for(int a = 1 ; a < value / 2 ; a++){
            for(int b = a ; b < value / 2 ; b++){
                double c = Math.sqrt((a*a)+(b*b));

                if((a+b+c) == value){
                    count++;
                }
            }
        }
        return count;
    }
}