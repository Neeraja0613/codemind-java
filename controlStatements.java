import java.util.Scanner;
public class SimpleControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conditional Statement Example: if
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Looping Statement Example: for loop
        System.out.println("Counting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
