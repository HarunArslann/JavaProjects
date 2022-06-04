import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] array = {2,3,4,1,5,6,4,1,1,6,8,4,3,5,2,2,3,6,7,3,3,2,4,4,2,5,6,2,8,6,8,5,4,8,9};

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int count = 1;

        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array.length ; j++){
                if((i != j) && (array[i] == array[j])){
                    count++;
                }
            }
            if(!hashMap.containsKey(array[i])){
                hashMap.put(array[i],count );
            }
            count = 1;
        }
        for(int i : hashMap.keySet()){
            System.out.println(i +  " sayisindan " + hashMap.get(i) +  " adet vardir.");
        }
    }
}