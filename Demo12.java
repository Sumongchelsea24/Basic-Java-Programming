public class Demo12 {
  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.greet();
  }
}
//local class

// class Outer {
//   void greet() {
//     class Local {
//       void sayHello() {
//          System.out.println("Hello");
        
//       }
//     }
//     Local local = new Local();
//     local.sayHello();
//   }
// }

//Effective final variable
class Outer {
  void greet() {
    int y=5;//modified garnu vayana yaslai
    class Local {
      void sayHello() {
         System.out.println( y);
        
      }
    }
    Local local = new Local();
    local.sayHello();
  }
}