
public class demo10 {
  public static void main(String[] args) {
    Outer outer = new Outer();
    //contructor use nagarda
    // Outer.Inner inner = new Outer.Inner();
    // inner.fun(outer);

    //constructor use gare paxi
    Outer.Inner inner = new Outer.Inner(outer);
    inner.fun();
  }
}
//static nested class
class Outer {
  static int x = 4;
  int y;//non-static
  // non-static lai direct inner classma access garna sakinna
  //so outer classko function ma parameter pass garera garna sakinxa

  static class Inner {

    //construtor ma reference pass garera pani garna sakinxa
    Outer outer;

    public Inner(Outer outer) {
      this.outer = outer;
    }

    // constuctor use nagarda
    // void fun(Outer outer) {
    //   System.out.println("Hello");
    //   System.out.println(x);
    //   System.out.println(outer.y);
    // }

    //constructor use gare paxi
    void fun() {
      System.out.println("Hello");
      System.out.println(x);
      System.out.println(outer.y);
    }
  }
}
