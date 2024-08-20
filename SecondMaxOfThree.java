import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t;
        Scanner sc= new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if((a>b && a<c) || (a<b && a>c))
            System.out.println(a);
            else if((b>a && b<c) || (b<a && b>c))
            System.out.println(b);
            else
            System.out.println(c);
        }
	}
}
