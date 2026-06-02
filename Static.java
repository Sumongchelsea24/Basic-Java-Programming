//static 
public class Static {

  public static void main(String[] args) {

    Employee e1 = new Employee("Rajesh", 1001, "Gorkha,Nepal");
    Employee e2 = new Employee("Rakesh", 1010, "Gorkhapur,India");

    System.out.println("Name : "+e1.name + " , " +"Employee_Id : " + e1.empId + " , " +"Address : "  + e1.address + " , "+"Employee_Company : " + Employee.companyName);
    System.out.println("Name : "+e2.name + " , "  +"Employee_Id : "  + e2.empId + " , " +"Address : " + e2.address + " , " +"Employee_Company : "+ Employee.companyName);
    

  }

}

class Employee {
  String name;
  int empId;
  String address;
  static String companyName;

  Employee(String name, int empId, String address) {
    this.name = name;
    this.empId = empId;
    this.address = address;
  }
  //static block
   static{
     companyName = "Google";
   }

  
}
