public class Ecap {
  public static void main(String[] args) {
    Student student = new Student("Ravi", 22, "Acem", "KTM");
    System.out.println(student);

  }
}

class Student {
  private String name;
  private int age;
  private String collegeName;
  private String address;

  Student(String name, int age, String collegeName, String address) {
    this.name = name;
    this.age = age;
    this.collegeName = collegeName;
    this.address = address;
  }

  //Getter and setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getCollegeName() {
    return collegeName;
  }

  public void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
