import java.util.Scanner;
public class number
{
    public static void main(String[] args)
    {
        int n,x;
        Scanner read= new Scanner(System.in);
        n=read.nextInt();
        x=read.nextInt();
        if(n>x)
        System.out.println(n);
        else
        System.out.println(x);
    }
}
