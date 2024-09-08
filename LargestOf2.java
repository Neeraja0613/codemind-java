import java.util.Scanner;
public class LargestOfTwo {
    public static void main(String[] args)
    {
        Scanner read = new Scanner (System.in);
        int a= read.nextInt();
        int b= read.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
        read.close();
    }
}
