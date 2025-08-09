package dsa;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        if (X == 0) {
            System.out.println(0);
        } else if (X == 1) {
            System.out.println(1);
        } else {
            int a = 0;
            int b = 1;
            int count = 2;

            while (count <= X) {
                int temp = b;
                b = b + a;
                a = temp;
                count++;
            }
            System.out.println(b);
        }
    }
}

