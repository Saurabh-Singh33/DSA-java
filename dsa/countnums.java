package dsa;

public class countnums {
    public static void main(String[]args){

        int X = 2368236;
        int count = 0;
        while (X >0){
            int rem = X % 10;
            if(rem == 3){
                count ++;
            }
         X = X / 10;
        }
        System.out.println(count);
    }
}
