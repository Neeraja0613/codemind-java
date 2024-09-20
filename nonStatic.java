//import java.util.Scanner;
class nonStatic 
{
    void sayHello()  //non static method
    {
        System.out.println("Hello");
    }
 
public static void main(String[] args)
{
    nonStatic e1=new nonStatic(); //object
    e1.sayHello();
    e1.sayHello();
    e1.sayHello();
}
}
