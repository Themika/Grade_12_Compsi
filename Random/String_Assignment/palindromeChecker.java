package Random.String_Assignment;
import java.util.Scanner;
public class palindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = sc.nextLine().toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString().toLowerCase();
        if (original.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}
