public class Demo6 {
  public static void main(String[] args) {
    A a = new B();
    a.fun();
  }
}
//static -override hudaina--They belong to class and not to objects
//private methods cannot be overriden
//final  methods cannot be overriden
//final in class --we cannot create child of that class

//fields / variables they cannot be polymorphic
class A {
  static void fun() {
    System.out.println("Hello");
  }

  private void fun2() {
    System.out.println("Hello guyz");
  }

  final void fun3() {
    System.out.println("Hello ");
  }
}

class B extends A {
  static void fun() {
    System.out.println("Bye");
  }
  private void fun2() {
    System.out.println("Hello everyone");
  }
}