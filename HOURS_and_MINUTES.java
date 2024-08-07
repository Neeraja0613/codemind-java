import java.util.Scanner;
public class sum
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int a=read.nextInt();
        int h=a/60;
        int m=a%60;
        System.out.printf("%d Hour(s) %d Minute(s)",h,m);
    }
}