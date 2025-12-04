package PART2.OOPS.INHERITANCE.CODE;

public class InheritanceTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        TwoWheeler bike = new TwoWheeler();
        bike.commute();
    }
}



//-------------compile and run execute from root ------------------ 
// javac -d . PART2/OOPS/INHERITANCE/CODE/*.java
// java PART2.OOPS.INHERITANCE.CODE.InheritanceTest
