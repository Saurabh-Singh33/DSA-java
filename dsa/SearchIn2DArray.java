package dsa;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[]args){
        int [] [] arr ={
                {2,3,4,6,5},
                {34,65,8,45},
                {12,35,67,8},
                {384,565,56,45}
        };
        int target = 45;
        int [] ans = Search(arr,target);//format of returning the value of row and columan
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int [][] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j =0 ; j < arr[i].length ; j++){
                if(arr [i][j] == target ){
                    return new int[] {i , j};
                }
            }

        }
        return new int [] {-1,-1};
    }

}
// for finding maximum value


