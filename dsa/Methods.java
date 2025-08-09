package dsa;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
      /*  int ans = sum2();  // Calling sum2 which returns int
        System.out.println("Returned sum = " + ans);
    }
    int ans = sum3(20,30);
    //pass the value of numbers whe u r calling the method in main()
    static int sum3(int a , int b ){
    int sum = a +b;
    return sum;
    }

    // Method that returns the sum
    static int sum2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
        return sum;  // RETURN the result
    }

    // Method that just prints sum, doesn't return it
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        String msg = great(name);  // Call the method
        System.out.println(msg);  // Print the returned value

    }

    static String great(String name) {
        String message = "Hello" + name;
        return message;
    }
    static String greet(){
        String greeting = "How r u ";
        return greeting;

    }
}