import college.Student;
import college.Teacher;
public class Demo1 {

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.print();

    //packageko naam lekhera pani garna sakinxa
    school.Student s2 = new school.Student();
    s2.print();

    Teacher t = new Teacher();
    t.print();
  }
  
}
