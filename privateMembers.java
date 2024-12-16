class Person {
    // Private member
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class AccessPrivateExample {
    public static void main(String[] args) {
        // Create an object of Person
        Person person = new Person();

        // Set private member using setter
        person.setName("Alice");

        // Access private member using getter
        System.out.println("Name: " + person.getName());
    }
}
