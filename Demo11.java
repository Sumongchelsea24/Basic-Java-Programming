//Inner class
public class Demo11 {
  public static void main(String[] args) {
    //Outer outer = new Outer();
    
    //Outer.Inner inner = outer.new Inner();

    Outer.Inner inner = new Outer().new Inner();
    inner.fun();
    inner.fun1();

  }
}

class Outer {
  int x = 10;

  class Inner {
    int x = 20;

    void fun() {
      System.out.println("Hello");
      System.out.println(x);
      System.out.println(Outer.this.x);
    }

    static void fun1() {
      System.out.println("Hello I am static");
    }
    
  }
}

