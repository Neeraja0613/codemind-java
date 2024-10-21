class Parent{
    void ThisIsABigMethod(){
        System.out.println("I am from Parent Class");
    }
}
class Child extends Parent{
    @Override
    void ThisIsABigMethod(){
        System.out.println("I am from Child Class");
    }
}
public class overriding {
    public static void main(String[] args) {
        Child child= new Child();
        child.ThisIsABigMethod();
    }
}
