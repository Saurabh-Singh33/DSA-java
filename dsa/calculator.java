package dsa;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.println("Enter the operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                        continue;
                    } else {
                        ans = num1 / num2;
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }

                System.out.println("Answer: " + ans);
            } else {
                System.out.println("Invalid operator. Try again.");
            }
        }

        System.out.println("Calculator exited.");
    }
}
