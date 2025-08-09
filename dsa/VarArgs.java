package dsa;
import java.sql.SQLOutput;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    /*   // Calling different methods with VarArgs
        Arr(23, 24, 43, 346, 326);
        multiple(254, 345, "Saurabh", "Raghu", "Manu");
        demo(10, 20, 30, 40, 50);
        demo("Java", "Swing", "Servlet");
    }

    // Method 1: Accepts variable number of integers
    static void Arr(int... v) {
        System.out.println("From Arr(): " + Arrays.toString(v));
    }

    // Method 2: Accepts two integers and then a variable number of Strings
    static void multiple(int a, int b, String... v) {
        System.out.println("From multiple(): a = " + a + ", b = " + b);
        System.out.println("Strings: " + Arrays.toString(v));
    }

    // Method 3a: Accepts variable number of integers
    static void demo(int... v) {
        System.out.println("From demo(int...): " + Arrays.toString(v));
    }

    // Method 3b: Accepts variable number of strings
    static void demo(String... v) {
        System.out.println("From demo(String...): " + Arrays.toString(v));*/

        // Method Overriding (other concept)
        //fun(67);
       // fun("Saurabh Singh");
        int ans = sum(3,4);
        System.out.println(ans);
    }
    static int sum(int a , int b){
        return a + b;
    }
    static int sum(int a , int b , int c){
        return a + b + c;
    }
    static void fun(int a){
        System.out.println("First One");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second One");
        System.out.println(name);
    }
}
