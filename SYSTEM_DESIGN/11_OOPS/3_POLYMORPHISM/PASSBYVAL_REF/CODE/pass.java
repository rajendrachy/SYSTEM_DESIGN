package PART3.POLYMORPHISM.PASSBYVAL_REF.CODE;

public class pass {

  public static void main(String[] args) {
    // Declare and initialize two integer variables
    int x = 5;
    int y = 10;

    // Call the add method with x and y as arguments and store the result in 'sum'
    int sum = add(x, y);

    // Print the original values of x, y, and the computed sum
    System.out.printf("x=%d, y=%d, sum=%d", x, y, sum);
  }

  // This method adds 'b' to 'a', then returns the result of a + b
  // Since Java is pass-by-value, the changes to 'a' and 'b' here do NOT affect x and y in main()
  public static int add(int a, int b) {
    a += b;          // a = a + b
    return a + b;    // return (a + b) → effectively returns original a + 2b
  }
}


