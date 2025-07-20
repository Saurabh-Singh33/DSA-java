package dsa;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // take full line as input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // take integer input

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        sc.close();  // good practice to close the scanner
    }
}
