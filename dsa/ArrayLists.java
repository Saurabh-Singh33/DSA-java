package dsa;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
      /*  list.add(23);
        list.add(432);
        list.add(43135);
        list.add(42353);
        list.add(23543);
        list.add(23);
        System.out.println(list.lastIndexOf(23));
     System.out.println(list.set(3,243));
        System.out.println(list.get(3));
        list.remove(1);
        System.out.println(list);*/
        int arr = sc.nextInt();
        for( int i = 0; i<5 ; i++){
            System.out.println(arr);
        }
for(int i = 0; i<5;i++){
    System.out.println(list.get(i));
}
System.out.println(list);
    }

}

