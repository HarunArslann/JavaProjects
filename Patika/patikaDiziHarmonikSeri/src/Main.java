public class Main {
    public static void main(String[] args) {
        int[] arr = {2,232,11,23,1,67};

        double average = 0;

        for(int i : arr){
            average += (1.0/i);
        }

        System.out.format("%.2f", average);
    }
}