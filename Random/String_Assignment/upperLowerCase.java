package Random.String_Assignment;
import java.util.Scanner;
class upperLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String upperStr = str.toUpperCase();
        String lowerStr = str.toLowerCase();

        System.out.println("Original String: " + str);
        System.out.println("Uppercase String: " + upperStr);
        System.out.println("Lowercase String: " + lowerStr);
    }
}