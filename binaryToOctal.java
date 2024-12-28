import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline after nextInt()
        
        for (int i = 0; i < t; i++) {
            String bin = sc.nextLine();
            int dec = Integer.parseInt(bin, 2);
            String oct = Integer.toOctalString(dec);
            System.out.println(oct);
        }
    }
}
