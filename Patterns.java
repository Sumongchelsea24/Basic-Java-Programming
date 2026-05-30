public class Patterns {

  public static void main(String[] args) {

    //Pattern 1
    // System.out.println("Pattern 1:");
    // for (int i = 1; i <= 5; i++) {
    //   for (int j = 1; j <= i; j++) {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    // System.out.println(" ");

    // //Pattern 2
    // System.out.println("\nPattern 2:");
    // for (int i = 5; i >= 1; i--) {
    //   for (int j = 1; j <= i; j++) {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }
    // System.out.println(" ");
    // //pattern 2 another way
    // for (int i = 1; i <= 5; i++) {
    //   for (int j = 5; j>=i; j--) {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    //   System.out.println(" ");
    // //Pattern 3
    // System.out.println("\nPattern 3:");
    // for (int i = 1; i <= 5; i++) {
    //   for (int j = 1; j <= 5 - i; j++) {
    //     System.out.print(" ");
    //   }
    //   for (int k = 1; k <= i; k++) {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // } 
    //Pattern 4
    System.out.println("\nPattern 4:");
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();

    }
     for (int k = 1; k <= 5; k++) {
        for (int l = 4; l >= k; l--) {
          System.out.print("* ");
        }
        System.out.println();

      }
  }
  
}
