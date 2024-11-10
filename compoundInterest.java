import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double P = scanner.nextDouble();
        double R = scanner.nextDouble();
        double T = scanner.nextDouble();
        
        double amount = P * Math.pow((1 + R / 100), T);
        double compoundInterest = amount - P;
        
        System.out.printf("%.2f\n", compoundInterest);
    }
}
