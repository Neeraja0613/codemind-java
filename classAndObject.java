class Dog {
    String name;
    int age;

    void bark() {
        System.out.println(name + " is barking!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.age = 5;
        myDog.bark();
    }
}
