public class Demo33 {
  public static void main(String[] args) {
    String s1 = new String("");
    String s2 = new String("Hello");

    String s3 = "Aditya";
    String s4 = new String(s3);

    // char array
    char[] arr = { 'A', 'd', 'i', 't', 'y', 'a', ' ', 'T', 'h', 'a', 'p', 'a' };
    String s5 = new String(arr);// values

    // System.out.println(s5);
    // char array subset
    String s6 = new String(arr, 0, 6);
    // System.out.print(s6);

    byte[] arr2 = { 97, 98, 99 };
    String s7 = new String(arr2, 0, 2);

    // System.out.println(s7);

    // StringBuilder /StringBuidler
    // StringBuilder sb = new StringBuilder("Hello");
    // String s8 = new String(sb);

    StringBuffer sb = new StringBuffer("Hello");
    String s8 = new String(sb);

    System.out.println(s8);
  }
}
