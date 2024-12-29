Hexa to binary:
import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Hexadecimal number
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.nextLine();

        // Convert hexadecimal to decimal
        int decimal = Integer.parseInt(hex, 16);

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        // Ensure binary string has leading zeros to match a 4-bit length per hex digit
        int numBits = hex.length() * 4;  // Each hex digit corresponds to 4 binary digits
        String paddedBinary = String.format("%" + numBits + "s", binary).replace(' ', '0');

        // Output: Binary equivalent with leading zeros
        System.out.println("The binary equivalent is: " + paddedBinary);

        scanner.close();
    }
}
