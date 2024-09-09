class Student{
    String rollNumber, name, gender;
    int age, passOutYear;
    double cgpa;
    void setAllValues(String roll, String n, String g, int a, int p, double c)
    {
        rollNumber=roll;
        name=n;
        gender=g;
        age=a;
        passOutYear=p;
        cgpa=c;
    }
    void printStudentDetails()
    {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Pass Out Year: " + passOutYear);
        System.out.println("CGPA: " + cgpa);
    }
}
class Example2 {
    public static void main(String[] args)
    {
        Student s1= new Student();
        s1.setAllValues("23P31A4430", "Neeraja", "Female", 18, 2027, 9.2);
        s1.printStudentDetails();
    }
}
