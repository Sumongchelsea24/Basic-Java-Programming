public class Array {

  public static void main(String[] args) {
    int rollNums[] = new int[5]; //declaration and initialization of array
    // rollNums[0] = 101; //assigning values to array
    // rollNums[1] = 102;
    // rollNums[2] = 103;
    // rollNums[3] = 104;
    // rollNums[4] = 105;

    // System.out.println(rollNums[0]);
    // System.out.println(rollNums[1]);   
    // System.out.println(rollNums[2]);
    // System.out.println(rollNums[3]);
    // System.out.println(rollNums[4]);
    // //length of array
    // System.out.println("Length of array: " + rollNums.length);

    //assigning values to array using for loop
    int x = 101;
    for (int i = 0; i < rollNums.length; i++) {
      rollNums[i] = x; //assigning values to array using for loop
      x++;
    }

    //iterating through array using for loop
    System.out.println("Iterating through array using for loop:");
    for (int i = 0; i < rollNums.length; i++) {
      System.out.println(rollNums[i]);
    }
    
  }
  
}
