public class Functions {
  
  public static void main(String[] args) {
    //Functions in Java

     greet();
     
     sayHello("Sujan Shrestha");// Arguments

     System.out.println(getNumber());
     
     System.out.println(multiply(10, 3));

  }
  //No input , NO output
  static void greet() {
    System.out.println("Hello");

  }
  //Input ,NO output
  static void sayHello(String name) {//Number of parameter can be anything
    System.out.println("Hello" + name);
  }
  
  //NO input, output
  static int getNumber() {
    return 10;
  }

  //Input , Output
  static int multiply(int a, int b) {

    return a * b;
  }
}
