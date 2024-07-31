import java.util.Scanner;
public class Example
{
    public static void main(String[] args)
    {
        double x,a,p;
        Scanner read=new Scanner(System.in);
        x=read.nextInt();
        a=3.14*x*x;
        p=2*3.14*x;
        System.out.printf("%.2f
",a);
        System.out.printf("%.2f",p);
    }
}