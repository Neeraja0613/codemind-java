import javax.swing.JOptionPane;

class Employee
{
    int id, salary;  //instance variable
    String name;  //instance variable
    Employee()  // constructor (default)
    {
        name= JOptionPane.showInputDialog("Enter your name: ");
        id=Integer.parseInt(JOptionPane.showInputDialog("Enter your id: "));
        salary=Integer.parseInt(JOptionPane.showInputDialog("Enter your salary: "));
        showDetails();
    }
    void showDetails()  //instance method
    {
        String outputString= "ID: " + id + "\nName: " + name + "\nSalary: " + salary;
        JOptionPane.showMessageDialog(null, outputString);
    }
}
class SampleExample2 {
    public static void main(String[] args) 
    {
        Employee e1= new Employee(); 
        //e1.showDetails();
        Employee e2= new Employee();
        //e2.showDetails();   
    }
}
