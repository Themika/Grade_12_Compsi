package Assighnments.String_Assignment;
import java.util.Scanner;
public class checkForSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();
        System.out.print("Enter the substring to check: ");
        String subString = sc.nextLine();
        sc.close();

        if (mainString.contains(subString)) {
            System.out.println("The substring is found in the main string.");
        } else {
            System.out.println("The substring is not found in the main string.");
        }
    }
}
