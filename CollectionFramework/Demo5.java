
import java.util.*;

public class Demo5 {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);
    // System.out.println(list.get(1));
    // list.set(1, 50);

    // list.addAll(0, List.of(39, 38, 90));

    // System.out.println(list);

    list.indexOf(2);
    list.lastIndexOf(5);

    // ListIterator<Integer> it = list.listIterator(3);

    // while (it.hasNext()) {
    // System.out.println(it.next());
    // }
    // reverse
    // while (it.hasPrevious()) {
    // System.out.println(it.previous());
    // }
    List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
    List<Integer> l2 = List.copyOf(l);
    System.out.println(l);
    System.out.println(l2);
  }
}