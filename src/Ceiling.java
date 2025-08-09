public class Ceiling {
    public static void main(String[] args) {
        int [] arr = {-1,-2,-34,37,39,46,78,89};
        int target = 38 ;
        int ans = Ceiling(arr, target);
        System.out.println(ans);

    }
    public static int Ceiling(int [] arr, int target){

        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start =  mid + 1;

            }
            else {
                return mid;
            }
        }
        return start;
    }
}