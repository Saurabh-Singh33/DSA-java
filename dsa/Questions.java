package dsa;
import java.util.Scanner;
public class Questions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num, 2)) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close();
    }

    static boolean isPrime(int num, int i) {
        if (num <= 2) {
            return (num == 2);
        }
        if (num % i == 0) {
            return false;
        }
        if (i * i > num) {
            return true;
        }
        return isPrime(num, i + 1);  // recursion instead of loop
        */


        //// What is an Armstrong Number?
        ////An Armstrong number (also known as a narcissistic number) for a 3-digit number is a number such that the sum of the cubes of its digits is equal to the number itself.
        ////
        ////🔢 Example:
        ////153 is an Armstrong number because: Square of 1 + Square of 5 + Square of 3 is equal = 153 again ..
                System.out.println("Armstrong numbers between 1 to 1000:");

                for (int i = 1; i <= 1000; i++) {
                    if (isArmstrong(i)) {
                        System.out.print(i + " ");
                    }
                }
            }

            // Method to check if a number is Armstrong
            static boolean isArmstrong(int num) {
                int original = num;
                int sum = 0;
                int digits = String.valueOf(num).length();

                while (num > 0) {
                    int digit = num % 10;
                    sum += Math.pow(digit, digits);
                    num /= 10;
                }

                return sum == original;
            }
        }



