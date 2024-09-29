// Class with public access specifier
public class Example {
    // Public method
    public void showMessage() {
        System.out.println("This is a public method.");
    }
}

// Main class to test the public method
public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        example.showMessage();  // Output: This is a public method.
    }
}
