// Sorting an array of Employees based on DateOfBirths
// Using Comparable interface
import java.util.Arrays;
class DateOfBirth {
    int day, month, year;
    // constructor -> parametric constructor
    public DateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
class Employee implements Comparable<Employee> {
    String name;
    double salary;
    DateOfBirth dob;
    public Employee(String name, double salary, DateOfBirth dob) {
        this.name = name;
        this.salary = salary;
        this.dob = dob;
    }
    public String toString() {
        return "Employee(" + name + ", " + salary + ", " + dob + ")";
    }
    public int compareTo(Employee that) {
        if (this.dob.year == that.dob.year) {
            if (this.dob.month == that.dob.month) {
                if (this.dob.day == that.dob.day) {
                    return this.name.compareTo(that.name);
                } else {
                    return this.dob.day - that.dob.day;
                }
            } else {
                return this.dob.month - that.dob.month;
            }
        } else {
            return this.dob.year - that.dob.year;
        }
    }

}
public class Task {
    public static void main(String[] args) {
        Employee[] emp = {new Employee("xyz", 50000, new DateOfBirth(17, 9, 1998)),
                          new Employee("abc", 80000, new DateOfBirth(12, 8, 1994)),
                          new Employee("pqr", 45000, new DateOfBirth(27, 12, 2000)),
                          new Employee("mno", 75000, new DateOfBirth(1, 1, 1996))};
        System.out.println("Before Sorting: ");
        for (Employee e: emp) System.out.println(e);
        // Sorting
        Arrays.sort(emp);
        System.out.println("After Sorting: ");
        for (Employee e: emp) System.out.println(e);
    }
}
