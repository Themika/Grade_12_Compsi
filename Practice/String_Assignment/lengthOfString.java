package Practice.String_Assignment;
import java.util.Scanner;

public class lengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int length = inputString.replaceAll("\\s+","" ).length();
        System.out.println("Your name has : " + length + " characters");
        System.out.println("First Letter: " + inputString.charAt(0));
        System.out.println("Last Letter: " + inputString.charAt(length - 1));
        sc.close();
    }
}
