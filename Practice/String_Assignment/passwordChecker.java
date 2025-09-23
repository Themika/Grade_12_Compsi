package Practice.String_Assignment;
import java.util.Scanner;
public class passwordChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a password: ");
            String password = sc.nextLine();
            if (password.length() < 8) {
                System.out.println("Password is too short. It must be at least 8 characters long.");
            } else if (!password.matches(".*[A-Z].*")) {
                System.out.println("Password must contain at least one uppercase letter.");
            } else if (!password.matches(".*[a-z].*")) {
                System.out.println("Password must contain at least one lowercase letter.");
            } else if (!password.matches(".*\\d.*")) {
                System.out.println("Password must contain at least one digit.");
            } else if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
                System.out.println("Password must contain at least one special character.");
            } else {
                
                System.out.println("Password is valid.");
                break;
            }
        }
        sc.close();
    }
}
