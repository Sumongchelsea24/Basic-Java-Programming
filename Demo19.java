import java.util.*;

public class Demo19 {
  public static void main(String[] args) throws CloneNotSupportedException {
    Student s1 = new Student();
    s1.name = "Hari Bahadur";
    s1.age = 55;
    //System.out.println(s1.toString());

    Student s2 = new Student();
    s2.name = "Hari Bahadur";
    s2.age = 55;

    //System.out.println(s1.equals(s2));//false aauxa override garepaxi true
    // Student s3 = null;
    // Integer i = 28;
    // System.out.println(s1.equals(s1));
    // System.out.println(s1.hashCode() == s2.hashCode());
    // System.out.println(s1.getClass().getName());
    // System.out.println(s2.getClass().getName());
    //System.out.println(s1 instanceof Student);

    Student s3 = (Student) s1.clone();
    System.out.println(s3.name);
    System.out.println(s3.age);
    
  }
}
//instanceOf operator -> Check if an object is instance of a class or subclass

class Student extends Object implements Cloneable {
  String name;
  int age;

  @Override
  public String toString() {
    return (name + "," + age);
  }
  @Override
  public boolean equals(Object object) {
    if (this == object)
      return true;
    if (object == null) {
      return false;
    }
    //Check if both classes are of type Studen
    //If not checked -->ClassCastExceptions
    if (object.getClass() != this.getClass()) {
      return false;
    }
    Student s = (Student) object;
    return (this.name == s.name && this.age == s.age);
  }

  @Override
  public int hashCode() {
    // int result = 17;
    // result = result * 31 + age;
    // result = result * 31 + ((name==null)?0:name.hashCode());

    return Objects.hash(name, age);

  }

  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}