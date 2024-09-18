class Person
{
    String name;
    int age;
    void introduce()
    {
        System.out.println("Hi, I am " + name + ", " + age + " years old.");
    }
}
class Students extends Person{

}
class Trainer extends Person{

}
class inheritence {
    public static void main(String[] args) {
        Students s1= new Students();
        Trainer t1= new Trainer();
        Person p1= new Person();
        //s1.name= "Neeraja";
        //s1.age= 17;
        //s1.introduce();
        System.out.println(p1 instanceof Person);
        System.out.println(s1 instanceof Person);
        System.out.println(t1 instanceof Person);
    }
}
