package dsa;
 import java.util.Scanner;
public class Switch {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

      /*  String fruit = sc.next();

        System.out.println(switch (fruit) {
            case "mango" -> "king of fruits";
            case "apple" -> "round of fruits";
            case "grapes" -> "small of fruits";
            case "orange" -> "round of fruits";
            case "guava" -> "unstructured of fruits";
            default -> "enter valid fruits";
        });*/

       /*
       int Day = sc.nextInt();

       switch(Day){
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            case 4 :
                System.out.println("thrusday");
                break;
            case 5 :
                System.out.println("friday");
                break;
            case 6 :
                System.out.println("saturday");
                break;
            default:
                System.out.println("haha CHHUTI HAI ");
        }*/

        int empID = sc.nextInt();
         ;

        switch(empID){
            case 1:
                System.out.println("Saurabh Singh");
                break;

            case 2:
                System.out.println("Aarushi Singh");
                break;

            case 3: {
                System.out.println("Gitanjali Singh Rathore");

                String department = sc.next();

                // Nested switch inside case 3 — enclosed in curly braces
                switch (department) {
                    case "IT":
                        System.out.println("She/He works in IT department");
                        break;
                    case "SAAS":
                        System.out.println("She/He works in SAAS department");
                        break;
                    case "SW":
                        System.out.println("She/He is a software Developer");
                        break;
                    default:
                        System.out.println("BAHUT UNEMPLOYMENT HAI BHAI");
                }
                break; // This break is for the outer switch-case
            }

            default:
                throw new IllegalStateException("Unexpected value: " + empID);
        }
    }
}