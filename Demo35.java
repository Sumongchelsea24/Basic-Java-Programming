public class Demo35 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("Rahul");
    // sb.append("Thapa");
    // System.out.println(sb);

    // // insert()
    // sb.insert(2, 'o');
    // System.out.println(sb);// Raohul

    // //delete
    // sb.delete(0, 2);
    // System.out.println(sb);

    // sb.deleteCharAt(1);

    // replace();
    // sb.replace(1, 3, "XY");
    // System.out.println(sb);

    // sb.reverse();
    // System.out.println(sb);

    // sb.charAt(1);
    // sb.setCharAt(3, 'r');

    // System.out.println(sb.length());// 5
    // System.out.println(sb.capacity());
    // sb.ensureCapacity(100);
    // System.out.println(sb.capacity());
    sb.trimToSize();

  }
}