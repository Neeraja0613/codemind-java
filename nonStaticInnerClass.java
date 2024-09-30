class Outer {
    private String message = "Hello from Outer!";

    // Non-static inner class
    class Inner {
        public void showMessage() {
            System.out.println(message); // Can access outer class members
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();  // Creating outer class object
        Outer.Inner inner = outer.new Inner();  // Creating inner class object
        inner.showMessage();  // Output: Hello from Outer!
    }
}
