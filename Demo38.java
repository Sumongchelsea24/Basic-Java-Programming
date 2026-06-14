public class Demo38 {
  public static void main(String[] args) {
    Box<Integer> b1 = new Box<>(10);// type argument
    Box<String> b2 = new Box<>("Hello Everyone");
    Box<Boolean> b3 = new Box<>(true);

    System.out.println(b1.getValue() + 5);
    System.out.println(b2.getValue() + 5);
    System.out.println(b3.getValue());
  }
}

// Generics
//Type information is not lost
class Box<T> {// type parameter
  private T value;

  Box(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

}