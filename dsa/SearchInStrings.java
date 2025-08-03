package dsa;
import java.util.Scanner;
public class SearchInStrings {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input main string
            System.out.print("Enter the string: ");
            String str = sc.nextLine();

            // Input the target character
            System.out.print("Enter the character to search: ");
            char target = sc.next().charAt(0);

            // Perform linear search
            int index = searchChar(str, target);

            if (index != -1) {
                System.out.println("Character found at index: " + index);
            } else {
                System.out.println("Character not found.");
            }

            sc.close();
        }

        // Linear search for a character
        static int searchChar(String str, char target) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == target) {
                    return i;
                }
            }
            return -1;
        }
    }
