public class Demo39 {
  public static void main(String[] args) {
    Pair<Integer, String> p1 = new Pair<>(2, "Hello");
    System.out.println(p1.first + "," + p1.second);
  }
}

// Generic class
// Type information is not lost
class Pair<T, U> {// type parameter
  T first;
  U second;

  Pair(T first, U second) {
    this.first = first;
    this.second = second;
  }

}