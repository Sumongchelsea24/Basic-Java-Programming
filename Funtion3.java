public class Funtion3 {

  static String name = "Shiva";
  public static void main(String[] args) {
    //Scope of variable

    int x = 4;//local scope
    int y = 5;

    System.out.println(x + "," + y);
    
    fun();
    System.out.println(name);


  }

  static void fun() {
    int x = 4;//local scope
    int y = 5;
    System.out.println(x + "," + y);
      System.out.println(name);
  }
}
