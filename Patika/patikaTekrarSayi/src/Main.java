import java.util.Arrays;

public class Main {

    public static boolean isFind(int[] arr, int value){

        for(int i : arr) {
            if (i == value) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] array = {12,4,2,3,4,1,5,65,34,22,12,44,23,76,45,342,86,75,34,12421,5512,342};
        int[] copy = new int[array.length/2];
        int startIndex = 0;

        for(int i=0 ; i < array.length ; i++){
            for(int j=0 ; j < array.length ; j++){
                if((i!=j)&&(array[i] == array[j])){
                    if(isFind(copy,array[i])){
                        copy[startIndex++] = array[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(copy));
    }
}