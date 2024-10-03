class ParameterizedConstructorExample {
       String name;
       int age;

       // Parameterized Constructor
       public ParameterizedConstructorExample(String name, int age) {
           this.name = name;
           this.age = age;
       }

       public void display() {
           System.out.println("Name: " + name);
           System.out.println("Age: " + age);
       }

       public static void main(String[] args) {
           ParameterizedConstructorExample obj = new ParameterizedConstructorExample("Alice", 25);
           obj.display();  // Output: Name: Alice, Age: 25
       }
   }
