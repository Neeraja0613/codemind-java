class Person{
    String name;
    int age;
}
class Student2 extends Person{
    String id;
    String branch;
    String college;
}
class Intern extends Student2{
    String internId;
    double salary;
}
class MultiLevelInheritance {
    public static void main(String[] args) {
        Intern i1=new Intern();
    }
}
