package QN2;
// Q2.
// Create a base class Person with attributes name and age.
// Derive a class Student from Person that adds an attribute rollNo.
// Write a main method to create an object of Student and display all the details (name, age, rollNo).




class Person {
  String name;
  int age;

 Person(String name, int age) {
    this.name = name;
    this.age = age;
 }
  void display() {
    System.out.println("Name: " + name + "age: " + age);
  }

}


class Student extends Person{
  int rollNo;

     Student(String name, int age, int rollNo) {
      super(name, age);
      this.rollNo = rollNo;
     }

     void display() {
      System.out.println("Name:" + name + ", age:" + age + ", rollNO:" + rollNo);
     }

}

public class Main {
   public static void main(String[] args) {
       Student s = new Student("Rajendra", 20, 2390);
        s.display();
   }
}


