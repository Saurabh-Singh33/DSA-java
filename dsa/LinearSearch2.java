package dsa;

public class LinearSearch2 {
    public static void main(String[] args) {
        int[] num = {2, 3, 5, 64, 65, 34, 56, 576};
        int target = 65;
        int ans = LinearSearch2(num, target);
        System.out.println(ans);
    }

    // Search the target and return the element
    // we can also find true or false by  replacing true and false at return and and replacing int by boolean
    static int LinearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1; // If array is empty
        }

        // Enhanced for loop
        for (int element : arr) {
            if (element == target) {
                return element; // Return the element itself if found
            }
        }

        return -1; // If target is not found
    }
}
