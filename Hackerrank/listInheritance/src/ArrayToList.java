import java.util.ArrayList;

public class ArrayToList implements MyList {

    ArrayList<String> arrayToList;

    public ArrayToList(){
    }

    @Override
    public void convert(String[] a) {
        int i = 0;

        for(String str : a){
            this.arrayToList.add(str);
            System.out.println("I have added the string: " + str + " at index: " + i);
            i++;
        }
    }

    @Override
    public void replace(int idx) {

        System.out.println("I have replaced the string:{" + this.arrayToList.get(idx) + "} with a null string");
        this.arrayToList.set(idx,"");

    }

    @Override
    public ArrayList<String> compact() {

        this.arrayToList.removeIf(str -> str.equals(""));

        return this.arrayToList;
    }
}
