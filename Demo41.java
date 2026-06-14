public class Demo41 {

  public static void main(String[] args) {
    Box<Integer> b1 = new Box<>();
    b1.value = 5;
    b1.printDouble();
  }
}

// Generics--> T can be anything
// Bounds in Generics
// upper Bound --> T is atleast Number or its subtype
class Box<T extends Number> {
  T value;

  public void printDouble() {
    System.out.println(value.doubleValue());
  }
}