import java.util.Scanner;
public class example
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        int c=a%b;
        System.out.println(c);
    }
}