//super()
public class Demo3 {

  public static void main(String[] args) {
    // CommerceStudent cs= new CommerceStudent();
    // cs.name = "Ravi";
    // cs.age = 22;
    // cs.rollNo = 201;
    // cs.college = "ACEM";
    // cs.print();
    CommerceStudent cs1 = new CommerceStudent("Ravi",22,201,"ACEM");
    cs1.print();
  }

}

class Student {
  String name;
  int age;
  int rollNo;

  Student() {

  }

  Student(String name,int age,int rollNo){
    this.name=name;
    this.age = age;
    this.rollNo = rollNo;
  }

  void print() {
    System.out.println(name+","+age+"," +rollNo);
  }
}

class CommerceStudent extends Student {
  String college;

  CommerceStudent(String name, int age, int rollNo, String college) {

    super(name,age,rollNo);
    this.college = college;
    }
  

  void print() {
    super.print();
    System.out.println(college);
  }
}