import java.util.Scanner;
import java.util.Arrays;
class matrices2 {
    public static void main(String[] args)
    {
        Scanner read= new Scanner(System.in);
        int r,c;
        r=read.nextInt();
        c=read.nextInt();
        int[][] mat=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=read.nextInt();
            }
        }
        Arrays.deepToString(mat);
    }
}
