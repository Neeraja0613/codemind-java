// Defining a class called 'Car'
public class Car {
    // Variables (attributes)
    String brand;
    int year;

    // Method (function)
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an object of class Car
        Car myCar = new Car();
        
        // Assigning values to object properties
        myCar.brand = "Toyota";
        myCar.year = 2020;
        
        // Calling method on the object
        myCar.displayInfo();
    }
}
