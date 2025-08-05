package dsa;

public class EvenDigits {
    public static void main(String[] args) {
           int [] nums = {12,345,2,6,7896};
           System.out.println(FindNumbers(nums));
           System.out.println(digits(-23462));
    }
    static int FindNumbers(int [] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count ++;
            }

        }
        return count;
    }
//function to check weather number contains even digit or not
     static boolean even(int num) {
      int NumberOfDigits = digits(num);


             if (NumberOfDigits % 2 == 0) {
                 return true;
             }
             return false;
             // return numberOfDigits % 2 ==0;


         }

    //count number of digits in number
    static int digits(int num){
        if (num ==0) {
            return 1;
        }
        if (num < 0){
            num = num * -1;
        }
        int count = 0;
        while(num > 0){
            count ++;
            num=num/10;  // num /=10
        }
        return count;

}
}