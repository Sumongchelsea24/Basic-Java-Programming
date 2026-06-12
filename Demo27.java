public class Demo27 {
  public static void main(String[] args) {
    MathConstant r1 = new Random();
    r1.fun();
  }

}

// varibales inside interface
interface MathConstant {
  double PI_VALUE = 3.14;
  int VALUE = 10;

  void fun();
}

class Random implements MathConstant {
  @Override
  public void fun() {
    System.out.println(PI_VALUE);
  }
}
