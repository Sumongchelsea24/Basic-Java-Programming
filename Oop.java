public class Oop {
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();

    s1.name = "Ravi";
    s1.age = 28;
    s1.rollNumber = 21;
    s1.college = "Pulchowk";

    s2.name = "Bijay";
    s2.age = 25;
    s2.rollNumber = 21;
    s2.college = "Advanced";

    s1.markAttendance();
    s2.markAttendance();

    s1.print();
    s2.print();
     
  }
}
class Student{
  String name;
  int age;
  int rollNumber;
  String college;

  void markAttendance() {
    System.out.print("");
  }

  void print() {
    System.out.println((name+","+age+","+rollNumber+"," +college));
  }
}