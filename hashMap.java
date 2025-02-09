import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        System.out.println("HashMap: " + map);

        map.remove(2);
        System.out.println("After removal: " + map);

        System.out.println("Value for key 1: " + map.get(1));
    }
}
