package Random.String_Assignment;
import java.util.Scanner;
public class initialsCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        String[] nameParts = fullName.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String part : nameParts) {
            if (!part.isEmpty()) {
                initials.append(part.charAt(0)).append(".");
            }
        }
        System.out.println("Your initials are: " + initials.toString().trim());
        sc.close();
    }
}
