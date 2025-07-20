package dsa;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        Syntax of if-else statement:
        if (condition) {
            // code when condition is true
        } else {
            // code when condition is false
        }
        */

      /*  int salary = 25000;

        // multiple if-else block
        if (salary > 20000) {
            salary += 3000;
        } else if (salary > 10000) {
            salary += 20000;
        } else {
            salary += 1000;
        }

        System.out.println("Updated salary: " + salary);
    }
}*/

    /* Syntax of  for loop
  for(initialisation;condition ; increment/decrement){
  //body
  }
     */

    //Q : print number from 1 to 5
   /* for(int num = 1 ; num <=5; num +=2){
    System.out.println(num);
    }
    }}*/

    // print number from 1 to n
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

   /* for(int num = 1; num <=n ; num++){
   // System.out.println(num + "");
    System.out.println("Hello , world");
    }*/
    //while loops


           /*     int num = 1;
                while (num <= 5) {
                    System.out.println(num);
                    num ++;
        }*/

        // DO WHILE
       /* int num = 1;
        do {
            System.out.println("Hello");
        } while (num != 1);*/

        //Largest number

           /*    System.out.print("Enter three numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();*/

               /* int max = a;
                if (b > max) {
                    max = b;
                }
                if (c > max) {
                    max = c;
                }*/

        // ANOTHER METHOD

    /*    int max = 0;
        if(a>b){
            max = a;
        } else{
            max = b;
        }
        if(c>max){
            mar = c;
        }*/
          /* int max = Math.max(c,Math.max(a,b));
                System.out.println("The largest number is: " + max);*/
       // System.out.println(Math.max(34,57)); FOR TWO NUMBERS

        System.out.print("Enter a character: ");
                char ch = sc.next().trim().charAt(0);

                if (ch >= 'A' && ch <= 'Z') {
                    System.out.println("Uppercase");
                } else if (ch >= 'a' && ch <= 'z') {
                    System.out.println("Lowercase");
                } else {
                    System.out.println("Not an alphabet character");
                }
            }
        }




