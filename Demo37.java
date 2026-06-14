public class Demo37 {
  public static void main(String[] args) {
    Box b1 = new Box(10);
    Box b2 = new Box("Hello Everyone");
    Box b3 = new Box(true);

    // Downcasting
    Integer x = (Integer) b1.getValue();
    String s = (String) b2.getValue();
    Boolean b = (Boolean) b3.getValue();

    System.out.println(x + 5);
    System.out.println(s + 5);
    System.out.println(b);
  }
}
//object is too generic type information lost
class Box {
  private Object value;

  Box(Object value) {
    this.value = value;
  }

  public Object getValue() {
    return this.value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

}