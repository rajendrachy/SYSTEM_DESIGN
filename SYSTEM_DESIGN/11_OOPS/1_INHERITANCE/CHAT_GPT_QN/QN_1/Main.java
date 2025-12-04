package QN_1;
// Q1.
// Create a base class Shape with a method display().
// Derive a class Circle from Shape and override the display() method to show "This is a Circle".
// Write a main method to create an object of Circle and call the display() method.
  

class Shape {
   void display() {
        System.out.println("Shape class");
   }
}

class Circle extends Shape {
   @Override
   void display () {
      System.out.println("Circle class");
   }
}


public class Main{
   public static void main(String[] args) {
     Circle c = new Circle();
     c.display();

     Shape s = new Circle();
     s.display();

     Shape s1 = new Shape();
     s1.display();

   }
}


