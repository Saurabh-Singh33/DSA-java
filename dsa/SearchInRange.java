package dsa;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = -7;

        // Option 1: Make method static and call directly
        System.out.println(LinearSearch(arr, target, 1, 4));
    }

    public static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        return -1; //return -1 instead of false
    }
}
