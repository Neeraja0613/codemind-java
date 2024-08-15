import java.util.Scanner;
public class EvenOrOdd
{
    public static void main(String[] args)
    {
        int number;
        Scanner read = new Scanner(System.in);
        number = read.nextInt();
        if(number % 2 == 0) 
            System.out.println(number + " is even.");
        else 
            System.out.println(number + " is odd.");
    }
}
