package Assighnments.String_Assignment;
import java.util.Scanner;
public class wordReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Make a sentence: ");
        String originalString = sc.nextLine();
        System.out.print("Enter the word to be replaced: ");
        String wordToReplace = sc.nextLine();
        System.out.print("Enter the replacement word: ");
        String replacementWord = sc.nextLine();
        sc.close();
        String modifiedString = originalString.replace(wordToReplace, replacementWord);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}
