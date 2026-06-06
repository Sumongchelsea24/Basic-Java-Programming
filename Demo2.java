//Types of inheritance
//1.Simple inheritance
//2.Multi-level inheritance
//3.Hierarchical inheritance
//4.Multiple inheritance:not supported in java

public class Demo2 {
  public static void main(String[] args) {
    
    EngineeringStudent es = new EngineeringStudent();
    es.markAttendance();
    es.attendLab();

    Student s = new Student();
    s.markAttendance();

    CSEEngineeringStudent cseEngineeringStudent = new CSEEngineeringStudent();

  }
}

class Student {//parent class
  String name;
  int age;

  void markAttendance() {
    System.out.println("Attendance marked");
  }

}

class EngineeringStudent extends Student {//child class
  void attendLab() {
    System.out.println("Lab attended Engineering student");
  }
}

class MedicalStudent extends Student { //child class
  void attendLab() {
    System.out.println("Lab attended Medical student");
  }
}

class CSEEngineeringStudent extends EngineeringStudent {//child child class 

}

/*
Multi-level
Student-EngineeringStudent-CSEEnginneringStudent
 */
/*
Hierarachical 
    A
  /   \
B     C
 */
/*
A   B
\   /
  C
*/
