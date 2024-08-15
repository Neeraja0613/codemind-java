import java.util.Scanner;
public class VoteEligibility
{
    public static void main(String[] args)
    {
        int age;
        Scanner read = new Scanner(System.in);
        age = read.nextInt();
        if(age >= 18) 
            System.out.println("You are eligible to vote.");
        else 
            System.out.println("You are not eligible to vote.");
    }
}
