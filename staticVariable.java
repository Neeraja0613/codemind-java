public class Student 
{
    static String schoolName = "ABC School";  // Static variable
    String studentName;

    public Student(String name) 
    {
        this.studentName = name;
    }

    public void display() 
    {
        System.out.println(studentName + " goes to " + schoolName);
    }

    public static void main(String[] args) 
    {
        Student student1 = new Student("John");
        Student student2 = new Student("Emma");
        
        student1.display();
        student2.display();
    }
}
