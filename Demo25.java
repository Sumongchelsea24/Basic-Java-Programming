

public class Demo25 {
  public static void main(String[] args) {
    // Direction[] directions = Direction.values();

    // for (Direction d : directions) {
    //   System.out.println(d.name());
    // }
    Direction d = Direction.valueOf("EAST");
    System.out.println(d.name());
    System.out.println(d.ordinal());
  }

}

//values() --> We can iterate in his eum
//valueOf() -->Convert a String into an enum constant
//name() vs toString()
//ordinal()
enum Direction {
  NORTH,
  SOUTH,
  EAST,
  WEST;
}
