public class Demo31 {
  public static void main(String[] args) {
    C c = new C();
    c.fun();
  }
}

// java Resolution priority rule
interface A {
  default void fun() {
    System.out.println("Inside A interface");
  }
}

class B {
  public void fun() {
    System.out.println("inside B class");
  }
}

class C extends B implements A {
  @Override
  public void fun() {
    System.out.println("inside C class");
  }
}
