public class Demo23 {
  public static void main(String[] args) {
    Direction d = Direction.NORTH;
    System.out.println(d.getDegree());

  }

}

enum Direction {
  NORTH(0),
  SOUTH(180),
  EAST(90),
  WEST(270);

  private int degree;

  private Direction(int degree) {
    this.degree = degree;
  }
    
  public int getDegree() {
    return this.degree ;
  }
  

}
