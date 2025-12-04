package PART3.POLYMORPHISM.CODE;
// In the declaration:
// class A extends B
// ✅ B is the superclass (parent/base class)

// ✅ A is the subclass (child/derived class)



import java.lang.Runtime.Version;


public class TestTransformation {

    public static void main(String[] args) {
      Car c = new Car();
      Vehicle v = new Vehicle();
     Plane p = new Plane();

   
         castTest(v);
         castTest(c);
        castTest(p);


      // Vehicle vCar = new Car();// Upcasting SubClass -> super Class // 	Safe, implicit
      // Car cVeh = (Car) new Vehicle(); // downcasting -> Superclass → Subclass

      // Object ref = new Car();

      // Object re = new Vehicle();

    }
    private static void castTest(Vehicle veh){
      //  veh.start();
 Car cVehicle = (Car) veh;
 cVehicle.start();
 cVehicle.nofDoor();
 
      }
}











