package dsa;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Saurabh Singh";
        {
            name = "Rahul";
            System.out.println(name);
         //   int a = 67; // its already initialised out side tha=e class u cant initialise it
System.out.println(name);
    a =100; // reassign the origin ref variable to some other value
    System.out.println(a);
    int c = 99;
    //values initialised in this block , will remain in the block
}
        {
            System.out.println(a);
           // System.out.println(c);//cant use outside the block
        }
    /*static void random (int marks){
            int num = 20 ;
            System.out.println(num);
            System.out.println(marks);*/
    }
    }


