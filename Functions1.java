public class Functions1 {
  
  public static void main(String[] args) {
    //Function overloading
    int x = sum(20, 80);
    System.out.println(x);

    int y = sum(25, 34);
    System.out.println(y);

    int z = sum(80, 12, 30);
    System.out.println(z);

    double f = sum(30, 80);
    System.out.println(f);

    greet("Sujan", 33);
    greet(33, "Sujan");
  }

  static int sum(int a, int b) {
    return (a + b);
  }

  //Different number if of parameters

  static int sum(int a, int b, int c) {
    return (a + b + c);
  }
  //different types of parameters
  static int sum(double a, double b) {
    return (int) (a + b);
  }

  static void greet(String name, int age) {
    System.out.println("Hi " + name + " Your age is " + age);
  }
  //order of parameters
  static void greet(int age, String name) {
     System.out.println("Hi " + name + " Your age is " + age);
  }
}
