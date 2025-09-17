package Random.String_Assignment;
import java.util.Scanner;
public class stringBonus {
    public static void isPalandrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        // Reverse the cleaned string
        
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
        str = str.toUpperCase();
        System.out.println("Capitalized String: " + str);
    }
    public static void reverse(String str) {
        //String Builder is a mutable sequence of characters. It is used to create and manipulate strings efficiently.
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
