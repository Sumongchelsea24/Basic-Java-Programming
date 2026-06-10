public class Demo24 {

  public static void main(String[] args) {
    Direction d = Direction.NORTH;
    d.move();
  }

}

enum Direction {
  NORTH {
    @Override
    public void move() {
      System.out.println("move up (Y+1)");
    }
  },
  SOUTH {
    @Override
    public void move() {
      System.out.println("move down (Y-1)");
    }
  },
  EAST {
    @Override
    public void move() {
      System.out.println("move right (X+1)");
    }
  },
  WEST {
    @Override
    public void move() {
      System.out.println("move left (X-1)");
    }
  };

  public abstract void move();
  

}
