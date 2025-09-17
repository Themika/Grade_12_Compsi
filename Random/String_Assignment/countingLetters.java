package Random.String_Assignment;
import java.util.Scanner;
public class countingLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("What letter do you want to count?");
        char target = sc.next().charAt(0);
        sc.close();
        int letterCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == target) {
                letterCount++;
            }
        }

        System.out.println("Total number of letters: " + letterCount);
    }
}
