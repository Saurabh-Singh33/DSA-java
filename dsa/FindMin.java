package dsa;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println("Minimum in 1D: " + min(arr));  // should print -7

        int[][] arr2D = {
                {1, 5, 3},
                {7, 2, 9},
                {4, 8, 6}
        };
        System.out.println("Maximum in 2D: " + max(arr2D));  // should print 9
    }

    // Return the minimum value in a 1D array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    // Return the maximum value in a 2D array
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
