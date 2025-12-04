package OOPS.ENCAPSULATION.CODE;

public class Car {
  public String color;
  public String model;

  private double fuelLevel;
  private long costOfPurches;


public Car() {

}

   // Constructor
  public Car(String color, String model, double fuelLevel, long costOfPurches) {
    this.color = color;
    this.model = model;
    this.fuelLevel = fuelLevel;
    this.costOfPurches = costOfPurches;
  }




   @Override
  public String toString() {
    return "Car{" +
           "color='" + color + '\'' +
           ", model='" + model + '\'' +
           ", fuelLevel=" + fuelLevel +
           ", costOfPurches=" + costOfPurches +
           '}';
  }

}






