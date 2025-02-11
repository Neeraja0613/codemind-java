import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Red"); // Duplicates are ignored

        System.out.println("HashSet: " + set);

        set.remove("Green");
        System.out.println("After removal: " + set);
    }
}
