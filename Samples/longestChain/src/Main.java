public class Main {
    public static void main(String[] args) {

        int maxChain = 1;
        int startingNumber = 1000000;

        for(int i=1000000 ; i>1 ; i--){

            if(chainLength(i) > maxChain){

                maxChain = chainLength(i);
                startingNumber = i;
            }
        }

        System.out.println("Starting number is : " + startingNumber + "\nChain Lenght is : " + maxChain);
    }

    public static int chainLength(int startingNumber){

        int chain = 1;
        long newNumber = startingNumber;

        while(newNumber != 1){

            if(newNumber % 2 == 0){
                newNumber = newNumber / 2;
                chain++;
            }else {
                newNumber = 3 * newNumber + 1;
                chain++;
            }

        }
        return chain;
    }
}