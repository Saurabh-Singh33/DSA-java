package dsa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays; // ✅ Required import

public class MultiDAL {
    public static void main(String[] args) {
        /* // Multi-dimensional ArrayList Input
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialization of 3 inner lists
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Adding elements to each inner list
        System.out.println("Enter 9 integers (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println("Multi-dimensional ArrayList:");
        System.out.println(list);
        */

        // Swap Question
        int[] arr = {1, 23, 45, 3, 25};
        swap(arr, 0, 4); // swap first and last elements
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}


