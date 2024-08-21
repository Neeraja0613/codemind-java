import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            // Your code goes here
            if(x>=y)
            System.out.println(y);
            else
            System.out.println(x+((y-x)*2));
        }
    }
}
