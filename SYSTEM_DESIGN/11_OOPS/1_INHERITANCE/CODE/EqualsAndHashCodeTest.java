package PART2.OOPS.INHERITANCE.CODE;

public class EqualsAndHashCodeTest {
  public static void main(String[] args) {
    Person person1 = new Person("John", 30, "12345");
        Person person2 = new Person("John", 30, "12345");

        if(person1 == person2 ) {
            System.out.println("person1 and person2 are the same object reference.");
        } else {
            System.out.println("person1 and person2 are different object references.");
        }

  }
}



