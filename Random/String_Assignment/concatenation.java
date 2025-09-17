package Random.String_Assignment;

import java.util.Scanner;

public class concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().trim();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().trim();
        sc.close();
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);
    }
}
