import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        // Declare and initialize a sorted array
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        // The target element to search for
        int target = 40;

        // Apply binary search
        int result = binarySearch(arr, target);

        // Print the result
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Method to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Element not found
        return -1;
    }
}
