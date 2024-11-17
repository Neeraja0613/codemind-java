public class JaggedArrayExample {
    public static void main(String[] args) {
        // Declare a 2D array with varying lengths for each row
        int[][] jaggedArray = new int[3][];
        
        // Initialize each row with different lengths
        jaggedArray[0] = new int[2]; // Row 0 has 2 columns
        jaggedArray[1] = new int[4]; // Row 1 has 4 columns
        jaggedArray[2] = new int[3]; // Row 2 has 3 columns

        // Fill the array with values
        int value = 1;
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = value++;
            }
        }

        // Print the jagged array
        System.out.println("Jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
