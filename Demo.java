import java.util.Scanner;

class Calculator {

    public int add(int x, int y) {
        int z = x + y;
        return z;
        
    }
    
    
}


public class Demo {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the first number:");
        int a = sc.nextInt();
        System.err.println("Enter the second number:");
        int b = sc.nextInt();
        
        //Creating the object of the calculator

        Calculator cal = new Calculator();
        
        int  r=cal.add(a, b);
        
        System.out.println("The sum of two number is " +r);

        


        
    }
}
