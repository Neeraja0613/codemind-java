class Student{
    String name;
    int age;
    void printDetails()
    {
        System.out.println(name + " " + age);
    }
}
class Example {
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.name="Neeraja";
        s1.age=18;
        s1.printDetails();
        Student s2=new Student();
        s2.name="Robin";
        s2.age=21;
        s2.printDetails();
    }
}
