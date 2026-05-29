public class Loops {
  public static void main(String[] args) {
    //loops
    //while loop

    //do while loop
    // int i = 1; 
    // do {
    //   System.out.println(i);
    //   i++;
    // } while (i <= 5);

    //for loop
    // for (int i = 1; i <= 5; i++) {
    //   System.out.println(i);
    // }
    // for (int j=5;j>=1;j--){
    //   System.out.println(j);
    // } 
    //comma separated variables in for loop
    // for (int i = 1, j = 1; i <= 10 && j <= 10; i++, j+=2) {
    //   System.out.println(i + " * " + j + " = " + (i * j));
    // }

    // boolean condition = true;
    // for (int i = 1; condition; i++) {
    //   System.out.println(i);
    //   if (i == 5) {
    //     condition = false;
    //   }
    // }
    //nested for loop
    // for (int i = 1; i <= 5; i++) {
    //   for (int j = 1; j <= 5; j++) {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }
    /*
    
    *
    * *
    * * *
    * * * *
    * * * * *
    
     */
    //outer loop for rows
    // for (int i = 1; i <= 5; i++) {
    //   //inner loop for columns
    //   for (int j = 1; j <= i; j++) {
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }
    //Jumps statements
    //break statement
    // for (int i = 1; i <= 10; i++) {
    //   if (i == 5) {
    //     break;
    //   }
    //   System.out.println(i);
    // }
    //continue statement
    // for (int i = 1; i <= 10; i++) {
    //   if (i == 5) {
    //     continue;
    //   }
    //   System.out.println(i);
    // }
    //Print odd numbers from 1 to 20
    // for (int i = 1; i <= 20; i++) {
    //   if (i % 2 != 0) {
    //     System.out.println(i);
    //   }
    // }
    //Even numbers from 1 to 20
    // for (int i = 1; i <= 20; i++) {  
    //   if (i % 2 == 0) {
    //     System.out.println(i);
    //   }
    // }
    //whether a number is prime or not
    //prime number means a number that is only divisible by 1 and itself
    //In nepali prime number vaneko tyo number ho jun 1 ra aafnai le matra divide huncha
    // int num = 29;
    // boolean isPrime = true;
    // for (int i = 2; i <= num / 2; i++) {
    //   if (num % i == 0) {
    //     isPrime = false;
    //     break;
    //   }
    // }
    // if (isPrime) { 
    //   System.out.println(num + " is a prime number.");
    // } else {
    //   System.out.println(num + " is not a prime number.");
    // }
    //  

    //Amstrong number means the sum of the cubes of the digits is equal to the number itself
    //In nepali Amstrong number vaneko digit haruko cube ko sum tyo number jasto hunu parcha

    //153 = 1^3 + 5^3 + 3^3
    // int num = 153;
    // int originalNum = num;
    // int sum = 0;
    // while (num > 0) {
    //   int digit = num % 10;
    //   sum += digit * digit * digit;
    //   num /= 10;
    // }
    // if (sum == originalNum) {
    //   System.out.println(originalNum + " is an Armstrong number.");
    // } else {
    //   System.out.println(originalNum + " is not an Armstrong number.");
    // }
    //labels in loops
    // outerLoop:
    // for (int i = 1; i <= 5; i++) {
    //   innerLoop: for (int j = 1; j <= 5; j++) {
    //     if (i == 3 && j == 3) {
    //       break outerLoop;
    //     }
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }
    //Code blocks in Java
    // first: {

    //   second: {

    //     third: {
    //       System.out.println("Hello, World!");

    //     }

    //   }

    // }
    //Fibonacci series means the sum of the two preceding numbers is equal to the next number
    //In nepali Fibonacci series vaneko dui ota agadi ko number ko sum tyo number jasto hunu parcha
    //0,1,1,2,3,5,8,13,21
    // int n = 10; //number of terms in the Fibonacci series
    // int a = 0, b = 1;
    // System.out.print("Fibonacci Series: ");
    // for (int i = 1; i <= n; i++) {
    //   System.out.print(a + " ");
    //   int next = a + b;
    //   a = b;
    //   b = next;
    // }
//palindrome number means a number that is the same when reversed
//In nepali palindrome number vaneko tyo number ho jun ulto garda pani tyo number jasto huncha
  //    int num = 12321;
  // int originalNum = num;
  // int reversedNum = 0;
  // while (num > 0) {
  //    int digit = num % 10;
  //   reversedNum = reversedNum * 10 + digit;
  //   num /= 10;
  // } 
  //   if (reversedNum == originalNum) {
  //     System.out.println(originalNum + " is a palindrome number.");
  //   } else {
  //     System.out.println(originalNum + " is not a palindrome number.");
  //   }
      }
    }
