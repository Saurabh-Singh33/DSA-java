package dsa;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 23, 45, 3, 25};
        System.out.println("Max in range (1 to 3): " + maxRange(arr, 1, 3));
        System.out.println("Max in full array: " + max(arr));
    }

    //  Find max in a specific range
    static int maxRange(int[] arr, int start, int end) {
        if (arr == null || start < 0 || end >= arr.length || start > end) {
            return -1; // Edge case handling
        }

        int maxval = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i]; //  Use i, not 1
            }
        }
        return maxval;
    }

    // Find max in the full array
    static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) { //  i <= arr.length  i < arr.length
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
        return maxval; // Return the result
    }
}

