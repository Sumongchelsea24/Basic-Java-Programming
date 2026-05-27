import java.util.Scanner;

public class Example {

  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.err.println("Enter the first number:");
        int a = sc.nextInt();
        System.err.println("Enter the second number:");
        int b = sc.nextInt();

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = b / a;
        int g = b % a;

        System.out.println(c + "," + d + "," + e + "," + f + "," + g);

        int h = a + 2;
        h += 2;//h=h+2;

        h -= 2;//h=h-2;
        h *= 3;//h=h*3;
        System.out.println(h);
  }
  
}
