public class Demo40 {
  public static void main(String[] args) {
    // String y = getResult("Hello");
    // System.out.println(y);
    printPair(11, "Hello");//Type inference

  }

  public static <T> T getResult(T x) { // <T> Type parameter
    return x;
  }

  public static <T, U> void printPair(T first, U second) { // <T> Type parameter
    System.out.println(first + "," + second);
  }
}

// Generic Method
// <T> returnType methodName(T parameter){}
