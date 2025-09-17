package Random.String_Assignment;

import java.util.Scanner;

public class pigLatinConverter {
    public static String convertToPigLatin(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        char firstChar = str.charAt(0);
        if ("aeiou".indexOf(firstChar) != -1) {
            return str + "way";
        } else {
            return str.substring(1) + firstChar + "ay";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to convert to Pig Latin: ");
        String str = sc.nextLine();
        str.toLowerCase();
        sc.close();
        System.out.println("Original String: " + str);
        System.out.println("Pig Latin String: " + convertToPigLatin(str));
    }
}
