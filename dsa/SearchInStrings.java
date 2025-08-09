package dsa;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Saurabh";
        char target = 'b';
        System.out.println(search(name, target)); // should print true
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
}



