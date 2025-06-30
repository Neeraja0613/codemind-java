import java.util.Scanner;
class example
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int i;
        int n= sc.nextInt();
        int a[]= new int[n];
        int pc=0, nc=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int x: a)
        {
            if(x<0)
            {
                nc+=1;
            }
            else
            {
                pc+=1;
            }
        }
        System.out.println(pc);
        System.out.println(nc);
    }
}
