import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> myList = new MyList<>();

        System.out.println(myList.isEmpty());
        System.out.println(myList.size());
        System.out.println(myList.getCapacity());

        myList.add(3);
        System.out.println(myList.isEmpty());
        myList.add(5);
        myList.add(7);
        myList.add(9);
        myList.add(11);

        System.out.println(myList.size());
        myList.clear();
        System.out.println(myList.size());









    }
}