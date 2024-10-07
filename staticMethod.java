
public class MathOperations 
{
    public static int square(int num)
    {
        return num * num;  // Static method
    }

    public static void main(String[] args) 
    {
        System.out.println("Square of 5: " + MathOperations.square(5));  // Call without object
    }
}
