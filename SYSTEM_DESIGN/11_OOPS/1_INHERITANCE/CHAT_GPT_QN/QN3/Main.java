package QN3;
// Q3. Student and Exam
// A university maintains details of students.
// Create a base class Student with fields: name, rollNo.
// Derive a class Exam that stores marks of 3 subjects.
// Derive another class Result from Exam that calculates total marks and percentage.
// Write a program to create an object of Result and display the student’s details with percentage.



class Student {
      String name;
      int rollNo;

      Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
      }

}


class Exam extends Student{
   int[] marks;

   Exam(String name, int rollNo, int[] marks) {
    super(name, rollNo);
    this.marks = marks;
   }

}

class Result extends Exam{
        
  int totalMarks = 0;
  double percentage = 0.0;

  Result(String name, int rollNo, int[] marks) {
    super(name, rollNo, marks);

    for(int mark : marks) {
      totalMarks += mark;
    }
  

      percentage = (double)totalMarks / marks.length;

  }


void display() {
  System.out.println("Name: " + name );
  System.out.println("RollNo: " + rollNo );
  System.out.println("Marks: " + totalMarks );
  System.out.println("Percentage " + percentage + "%");

}


}



public class Main {
  public static void main(String[] args) {
    int [] marks = {60, 80, 90};

    Result r = new Result("Ram", 231, marks);
    r.display();
  }
}






