package PART3.POLYMORPHISM.CODE3;

// ---------------Simple Java Example with Notes: Method Overriding-------------

// Superclass
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound() method of Animal
    @Override
    void sound() {
           //super.sound(); // if we call this the parent class sound also called

        System.out.println("Dog barks");
    }
}




// Main class to test method overriding
public class Main {
    public static void main(String[] args) {
        // Create a Dog object
        Dog d = new Dog();

        // Call the overridden method
        d.sound();  // Output: Dog barks

        // Create an Animal reference to Dog object (Upcasting)
        Animal a = new Dog();
        a.sound();  // Output: Dog barks (runtime polymorphism)
       
    }
}



// ----------- Notes (Text Format):--------------
// Superclass: A class that defines a general behavior. In our example, Animal is the superclass because it provides a basic method sound().

// Subclass: A class that extends the superclass and overrides its method. Here, Dog is the subclass because it provides its own version of the sound() method.

// Method Overriding: This occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.

// @Override: This is an optional annotation used to indicate that a method is being overridden. It helps catch errors at compile time if the method signature doesn't match the superclass method.

// Polymorphism: The overridden method is called based on the actual type of the object at runtime, not the reference type. For example, even if we write Animal a = new Dog();, the Dog version of sound() is called.

// Upcasting: This refers to using a parent class reference to refer to a child class object. Example: Animal a = new Dog();. This enables polymorphic behavior.

