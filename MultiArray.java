public class MultiArray {
  
  public static void main(String[] args) {
    //Muyltidimensional array
    // int marks[][] = new int[3][3]; //declaration and initialization of
    // //multidimensional array
    // //assigning values to multidimensional array
    // marks[0][0] = 85;
    // marks[0][1] = 90;
    // marks[0][2] = 95;

    // marks[1][0] = 80;
    // marks[1][1] = 85;
    // marks[1][2] = 90;

    // marks[2][0] = 75;
    // marks[2][1] = 80;
    // marks[2][2] = 85;
    // //iterating through multidimensional array using for loop
    // System.out.println("Iterating through multidimensional array using for loop:");
    // for (int row = 0; row < marks.length; row++) {
    //   for (int col = 0; col < marks[row].length; col++) {
    //     System.out.print(marks[row][col] + " ");
    //   }
    //   System.out.println();
    // }

    //Multidimensional array each with different length

    // int marks[][] = new int[3][]; //declaration and initialization of multidimensional array each with different length
    // marks[0] = new int[1]; //assigning values to multidimensional array each with different length
    // marks[1] = new int[2];
    // marks[2] = new int[3];

    // marks[0][0] = 85;
    // marks[1][0] = 80;
    // marks[1][1] = 85;
    // marks[2][0] = 75;
    // marks[2][1] = 80;
    // marks[2][2] = 85;
    // //iterating through multidimensional array each with different length using for loop
    // System.out.println("Iterating through multidimensional array each with different length using for loop:");
    // for (int row = 0; row < marks.length; row++) {
    //   for (int col = 0; col < marks[row].length; col++) {
    //     System.out.print(marks[row][col] + " ");
    //   }
    //   System.out.println();
    // }

    //1-D
    int rollNums[] = { 101, 102, 103, 104, 105 }; //declaration and initialization of 1-D array
    for (int i = 0; i < rollNums.length; i++) {
      System.out.print(rollNums[i] + " ");
    }
    //2-D
    int marks[][] = { { 85, 90, 95 }, { 80, 85, 90 }, { 75, 80, 85 } }; //declaration and initialization of 2-D array
 
   System.out.println("\nIterating through 2-D array using for loop:");
   for (int row = 0; row < marks.length; row++) {
     for (int col = 0; col < marks[row].length; col++) {
       System.out.print(marks[row][col] + " ");
     }
     System.out.println();
   }
      }
}
