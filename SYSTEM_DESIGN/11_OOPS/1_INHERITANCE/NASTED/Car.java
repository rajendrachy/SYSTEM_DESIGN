package PART2.OOPS.INHERITANCE.NASTED;

public class Car {

  private int noOFDoors;

  public void repair() {
    Tire tire = new Tire();
  }
  public class Tire {
    private double width;
    private double pressure;
    private String material;

    public void inflate() {
     noOFDoors = 8;
    }

  }
}







