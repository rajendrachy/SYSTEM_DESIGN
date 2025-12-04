package PART3.POLYMORPHISM.CODE2;
//  -----------------Compile-Time Polymorphism also known as Method Overloading in Java.---------------------
public class Overloading {
    public int add (int a, int b) {
      return a + b;
    }


    public String add(String a, String b) {
       return a + b;
    }


  public int add(int a, int b, int c, int d) {
    return a + b + c + d;

   }


    public static void main(String[] args) {
      Overloading over = new Overloading();
      System.out.println(over.add(5, 4));
      System.out.println(over.add("Raj", "endra"));
      System.out.println(over.add(1, 3, 4, 6));
    }
}




