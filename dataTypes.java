import java.util.Scanner; 
public class DataTypeInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValue = scanner.nextInt();
        float floatValue = scanner.nextFloat();
        double doubleValue = scanner.nextDouble();
        char charValue = scanner.next().charAt(0); 
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Int: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Char: " + charValue);
        System.out.println("Boolean: " + booleanValue);
    }
}
