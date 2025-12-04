package PART3.POLYMORPHISM.CODE2;

public class ConstructorOverloading {

    // Default constructor
    ConstructorOverloading() {
        System.out.println("Default constructor called");
    }

    // Constructor with one int parameter
    ConstructorOverloading(int a) {
        System.out.println("Constructor with one int: " + a);
    }

    // Constructor with two parameters
    ConstructorOverloading(String name, int age) {
        System.out.println("Constructor with String and int: " + name + ", " + age);
    }

    // Constructor with one double parameter
    ConstructorOverloading(double salary) {
        System.out.println("Constructor with one double: " + salary);
    }

    public static void main(String[] args) {
        // Different constructor calls
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(10);
        ConstructorOverloading obj3 = new ConstructorOverloading("Raj", 25);
        ConstructorOverloading obj4 = new ConstructorOverloading(55000.75);
    }
}
