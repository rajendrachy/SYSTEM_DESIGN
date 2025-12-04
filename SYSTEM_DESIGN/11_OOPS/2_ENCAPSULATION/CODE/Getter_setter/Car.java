package PART2.OOPS.ENCAPSULATION.CODE.Getter_setter;

public class Car {
  private String color; // public  access cheaya
  private String model; // public
  private double fuelevel; // public
  private long costOfPurchase; // default access cheaya

  public Car(String color, String model, double fuelevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelevel = fuelevel;
        this.costOfPurchase = costOfPurchase;
    }


    // -------GEtter-----------
  public String getColor() {
    return color;
  }


  //---------setter-------------
void setColor (String color) {

  if(color.equals("Yellow")) {
    System.out.println("pagal hya Kya");
  } else {
  this.color = color;

  }
}


  //------Getter---------------
  public String getModel() {
    return model;
  }





   public static void main(String[] args) {
        Car myCar = new Car("Black", "Honda City", 45.8, 1200000);

        myCar.setColor("Blue");


        System.out.println("Color: " + myCar.getColor());
        System.out.println("Model: " + myCar.getModel());
        
       
    }


}
