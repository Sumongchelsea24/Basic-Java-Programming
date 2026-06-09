public class Demo17 {
  public static void main(String[] args) {

    College college = new College("ACEM", "Kalanki");

    Student student = new Student(28, "Sunil", college);

    // System.out.println(student.getAge());
    // System.out.println(student.getName());
    System.out.println(student.getCollege().name);//ACEM
    student.getCollege().name = "PEC";
    System.out.println(student.getCollege().name);

  }
}

//Not purely immutable
final class Student {
  private final int age;
  private final String name;
  private final College college;

  Student(int age, String name,College college) {
    this.age = age;
    this.name = name;
    this.college = college;
  }

  //gettes 
  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public College getCollege() {
    return this.college;
  }

}

//Mutable
class College {
  String name;
  String address;

  College(String name, String address) {
    this.name = name;
    this.address = address;
    }

  
  
}
