package dsa;
//https://leetcode.com/problems/richest-customer-wealth/description/

public class MaxWealth {
    public static void main(String[] args) {
    }

    public int maximumWealth(int[][] accounts) {
        //persion = rol
        //persion = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++){


    //when you start a new col,take a new sum for that row
    int sum = 0;
         for(int account = 0; account<accounts[person].length;account++){


        sum += accounts[person][account];

    }
         //NOW WE Have sum of account of person
            //check with overall ans

            if (sum  > ans){
                ans =  sum;
            }


        }
        return ans;
}}