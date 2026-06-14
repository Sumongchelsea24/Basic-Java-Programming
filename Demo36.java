public class Demo36 {
  public static void main(String[] args) {
    // Upcasting
    String s = "Hello";
    Object obj = s;
    // System.out.println(obj);

    // Downcasting
    Object obj2 = "Dilan";
    String s2 = (String) obj2;
    System.out.println(s2);
  }
}