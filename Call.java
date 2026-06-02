//call by value
public class Call {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    System.out.println(x + ", " + y);
    addTen(x, y);
    System.out.println(x + ", " + y);

  }

   static void addTen(int x, int y){
    x = x + 10;
    y = y + 10;
    
  }

}

