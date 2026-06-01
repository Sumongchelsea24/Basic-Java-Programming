public class Oop1 {
  public static void main(String[] args) {
    //int x; //local variable --> no default value because it is stored in stack memory


    //Employee e1 = new Employee();
    //default value of instance variable 
    // System.out.println(e1.name); //null 
    // System.out.println(e1.age); //0
    // System.out.println(e1.id); //0
    // System.out.println(e1.company); //null
    Employee e1 = new Employee("Ravi", 28, 21, "Pulchowk");
    System.out.println(e1.name + ", " + e1.age + ", " + e1.id + ", " + e1.company);
    e1.work();
    


  }
}

/*Deflault value 
  int --> 0
  String --> null
  boolean --> false
  float --> 0.0
  double --> 0.0

 */
class Employee {
  //Instance variable --> stored in heap memory --> default value is assigned by java compiler
  String name;//information /data /characteristics /properties /attributes--> instance variable
  int age;
  int id;
  String company;

  // Employee() {
  //   //constructor --> used to initialize the instance variable
  //   name = "Ravi";
  //   age = 28;
  //   id = 21;
  //   company = "Pulchowk";
  // }
  Employee(String name, int age, int id, String company) {
    this.name = name;
    this.age = age;
    this.id = id;
    this.company = company;
  }

  //behavior /functionality /actions /operations --> instance method
  void work() {
    System.out.println("Employee is working");
  }

  
}
