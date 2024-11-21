interface Animal  
{ 
    void eat(); 
} 
interface Flyable  
{ 
    void fly(); 
} 
class Bird implements Animal, Flyable  
{ 
    public void eat()  
    { 
        System.out.println("Bird is eating."); 
    } 
    public void fly()  
    { 
        System.out.println("Bird is flying."); 
    } 
} 
 
public class Main  
{ 
    public static void main(String[] args)  
    {  
        Bird bird = new Bird(); 
        bird.eat(); 
        bird.fly(); 
    }
