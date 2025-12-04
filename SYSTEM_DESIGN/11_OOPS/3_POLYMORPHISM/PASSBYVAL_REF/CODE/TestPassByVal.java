package PART3.POLYMORPHISM.PASSBYVAL_REF.CODE;

public class TestPassByVal {

  public static void main(String[] args) {
    Point p = new Point(5, 10);
    System.out.println("Before: " + p);
    move(p);
    System.out.println("After: " + p);
  }

  public static void move(Point p) {
    p.x = p.x + 1;
    p.y = p.y + 1;
    System.out.println("Inside move: " + p);
  }

  public static class Point {
    int x;
    int y;

    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public String toString() {
      return "(" + x + ", " + y + ")";
    }
  }
}
