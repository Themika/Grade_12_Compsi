package Assighnments.String_Assignment;
import java.util.Scanner;
public class stringBonus {
    public static void isPalandrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        if (cleanedStr.equals(reversedStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
    public static void capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder capitalizedStr = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                capitalizedStr.append(Character.toUpperCase(word.charAt(0)))
                              .append(word.substring(1).toLowerCase())
                              .append(" ");
            }
        }
        System.out.println("Capitalized String: " + capitalizedStr.toString().trim());
    }
    public static void reverse(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println("Reversed String: " + reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        reverse(str);
        countVowelsAndConsonants(str);
        capitalizeWords(str);
        isPalandrome(str);
    }
}
