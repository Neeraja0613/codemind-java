public class ImplicitCastingExample {
    public static void main(String[] args) {
        int intValue = 100;         
        long longValue = intValue;     
        double doubleValue = longValue; 

        System.out.println("Integer value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Double value: " + doubleValue);
    }
}
