package dsa;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();

        // System.out.println(num);

        //Type Casting
        // int num = (int)(34.349f);
        //  System.out.println(num);

        //Automatic type promotion in expression
        // int a = 257;
        //byte b = (byte) (a);//257 % 256 = 1

        //  byte a = 40;
        //byte b = 50;
        // byte c = 100;
        // int d = a*b/c;

        // System.out.println(d);


        // int number = 'A';
        // System.out.println(number);


       /* byte b = 32;
        char c = 'A';
        short s = 1283;
        int i = 34694;
        float f = 2328.438f;
    double d = 238.2834;
    double result = (f*b) + (i/c) - (d-s);
    System.out.println((f*b) + " " + (i / c) + " " + (d-s));
    System.out.println(result);*/
        //  int a = 10;
        //  if(a==10){
        //      System.out.println("Hello World");}


        // Basics of loop
      /* int i = 4;
        while(i !=10){
            System.out.println(i);
            i++;
        }*/

        // For Loop   == if you know how many time u want to run the loop
       /* for (int count = 1; count != 5; count++) {
            System.out.println(count);
        }
    */

        System.out.println("Enter temp in c : ");
        float tempc = input.nextFloat();
        float tempF = (tempc * 9 / 5) + 32;
        System.out.println(tempF);
    }}