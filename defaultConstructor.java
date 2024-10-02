  class DefaultConstructorExample {
       String name;

       // Default Constructor
       public DefaultConstructorExample() {
           name = "Default Name"; // Assigning default value
       }

       public void display() {
           System.out.println("Name: " + name);
       }

       public static void main(String[] args) {
           DefaultConstructorExample obj = new DefaultConstructorExample();
           obj.display();  // Output: Name: Default Name
       }
   }
