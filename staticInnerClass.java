class Outer {
    private static String message = "Hello from Static Inner!";

    // Static inner class
    static class Inner {
        public void showMessage() {
            System.out.println(message);  // Can access static members only
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();  // No need for outer class instance
        inner.showMessage();  // Output: Hello from Static Inner!
    }
}
