import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String ,Integer> hashMap = new HashMap<>();

        hashMap.put("a",1);
        hashMap.put("b",2);

        hashMap.replace("a",3);
        System.out.println(hashMap);
    }
}