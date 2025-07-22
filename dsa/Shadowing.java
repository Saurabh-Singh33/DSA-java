package dsa;

public class Shadowing {
   static  int x = 10;//This will be shadowed at line number 8
    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;//This will shadow the line 4
        // Scope will begin when value is initialised
        System.out.println(x);
        math();
    }
    static void math(){
        System.out.println(x);
    }
}
