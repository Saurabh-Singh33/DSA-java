package dsa;

public class LinearSearch {
    public static void main(String[]args){
        int [] num = {2,3,5,64,65,34,56,576,};
        int target = 5;
        int ans = LinearSearch(num , target);
        System.out.println(ans);
    }
    //Search the target
    static int LinearSearch(int []arr , int target) {
        if (arr.length == 0) {
            return -1;

        }
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return  -1;
    } }
    //this line will execute if the none of the return statement above execute
//hence the target not found
