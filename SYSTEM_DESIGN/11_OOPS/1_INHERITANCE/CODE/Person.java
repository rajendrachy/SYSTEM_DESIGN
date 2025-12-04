package PART2.OOPS.INHERITANCE.CODE;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String id;

    // Constructor to initialize the fields
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    /**
     * Overrides the equals() method to compare two Person objects
     * based on their name, age, and id.
     */
    @Override
    public boolean equals(Object obj) {
        // Check if the object is of type Person
        if (!(obj instanceof Person)) {
            return false;
        }
        // Typecast the object to Person
        Person per = (Person) obj;

        // Compare all fields for equality
        return this.name.equals(per.name) && this.age == per.age && this.id.equals(per.id);
    }

    /**
     * Overrides the hashCode() method to ensure consistency with equals().
     * Uses Objects.hash() to generate a hash code based on name, age, and id.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Setter for id
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Overrides toString() to provide a string representation of the object.
     */
    @Override
    public String toString() {
        return "Equals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}


