class Cat 
{
    String name;
    int age;
    // CONSTRUCTOR OVERLOADING
    // A default constructor
    Cat() {}
    // One more constructor
    Cat(String n)
    {
        name=n;
    }
    /*Cat()
    {
        System.out.println("Hey you created a new instance of this class");
    }*/
    // parametric constructor
    Cat(String n, int a)
    {
        name=n;
        age=a;
    }
    void printCatDetails()
    {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}
class Example3 {
    public static void main(String[] args)
    {
        Cat c1= new Cat("Fluff",7);
        c1.printCatDetails();
        Cat c2= new Cat("Stella");
        c2.printCatDetails();
        Cat c3= new Cat();
        c3.printCatDetails();
        // instanceof -> whether an object is an instance of a particular class...
        // boolean
        //System.out.println(c1 instanceof Cat);  //true
        //System.out.println(c1 instanceof Object);  //true
    }
}
