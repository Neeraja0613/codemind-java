import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        n = sc.nextInt();
        int[] a = new int[n];
        long sum = 0;

        // Read the array elements
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Initialize array elements with input
            sum += a[i];         // Add the element to the sum
        }

        // Print the result
        System.out.println(sum);
        sc.close(); // Close the scanner to free resources
    }
}
