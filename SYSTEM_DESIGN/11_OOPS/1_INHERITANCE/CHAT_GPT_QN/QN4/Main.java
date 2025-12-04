package QN4;

// Q4. Employee and Manager
// A company wants to store details of employees.
// Create a class Employee with fields: empId, name, salary.
// Derive a class Manager that adds a field department.
// Derive a class GeneralManager that adds travelAllowance.
// Write a program to calculate the total salary of a General Manager and display all details.


class Employee {
  int empId;
  String name;
  int salary;

  Employee(int empId, String name, int salary) {
    this.empId = empId;
    this.name = name;
    this.salary = salary;
  }
}



class Manager extends Employee {
   String department;
   Manager(int empId, String name, int salary, String department) {
     super(empId, name, salary);
     this.department = department;
   }
}


class Generalmanager extends Manager{
   int travelAllowance;

    Generalmanager(int empId, String name, int salary, String department, int travelAllowance) {
      super(empId, name, salary, department);
        this.travelAllowance = travelAllowance;
    }
    
    int getTotalSalary() {
      return salary + travelAllowance;
    }

    void display() {
      System.out.println("EMpId: " + empId);
      System.out.println("Name: " + name);
      System.out.println("Salary: " + salary);
      System.out.println("Department: " + department);
      System.out.println("TravelAll: " + travelAllowance);
      System.out.println("Total Sal rs.: " + getTotalSalary());
    }

}



public class Main {
  public static void main(String[] args) {
    Generalmanager g = new Generalmanager(2311, "raj", 100000, "It", 20000);
    g.display();

  }
}



