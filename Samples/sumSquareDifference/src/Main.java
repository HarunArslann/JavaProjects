public class Main {
    public static void main(String[] args) {

        int totalSquare = 0, squareTotal = 0;
        int diff;

        for(int i = 1 ; i<=100; i++){
            totalSquare += i;
            squareTotal += i*i;
        }
        totalSquare = totalSquare*totalSquare;
        diff = totalSquare - squareTotal;
        System.out.println(diff);
    }
}