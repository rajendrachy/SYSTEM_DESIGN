package PART3.POLYMORPHISM.CODE2;

//  ------------What is super in Java?-------------
// The super keyword in Java is used to:
// Access the superclass constructor
// Access superclass methods
// Access superclass variables




class Vehicle {
    int speed = 60;

    Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    void display() {
        System.out.println("This is a vehicle.");
    }
}




class Car extends Vehicle {
    int speed = 120; // subclass variable

    Car() {
        super(); // Calls Vehicle() constructor
        System.out.println("Car constructor called");
    }

    void showSpeed() {
        System.out.println("Speed of Car (subclass): " + speed);           // 120
        System.out.println("Speed from Vehicle (superclass): " + super.speed); // 60
    }


    void display() {
        super.display(); // Calls Vehicle's display method
        System.out.println("This is a car.");
    }
}




public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.showSpeed();
        myCar.display();
    }
}





