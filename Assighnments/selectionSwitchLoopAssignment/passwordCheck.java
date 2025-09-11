package Assighnments.selectionSwitchLoopAssignment;
import java.util.Scanner;
public class passwordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "secret";
        String userInput;
        while (true) {
            System.out.print("Enter password: ");
            userInput = sc.nextLine();
            if (userInput.equals(correctPassword)) {
            System.out.println("Access granted");
            break;
            } else {
            System.out.println("Access denied. Try again.");
            }
        }
        sc.close();
    }
}
