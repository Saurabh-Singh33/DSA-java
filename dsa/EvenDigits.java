package dsa;

public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(FindNumber(nums));
        System.out.println(digits(2387569));
    }
    static int FindNumber(int [] nums){
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count ++;

            }
        }
        return count;
    }
// To check  it is even or not
     static boolean even(int num) {
        int NumberOfDigits = digits(num);
     /*   if (NumberOfDigits % 2 ==0){
            return true ;
        }
        return false;*/
         return NumberOfDigits % 2 ==0;
    }

    // for further optimization
    /* static int digits(int num){
    return (int(Math.log10(num)) + 1;
     */
    static int digits(int num){
        if(num == 0){
            return 1;
        }
        if (num <0 ){
            num = num * -1;
        }
        int count = 0;

        while(num > 0){
            count++;
            num = num/10;
        }
        return count ;
    }
}