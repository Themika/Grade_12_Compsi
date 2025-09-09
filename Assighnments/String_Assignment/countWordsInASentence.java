package Assighnments.String_Assignment;

import java.util.Scanner;

public class countWordsInASentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = sc.nextLine();
        sc.close();
        String[] words = inputSentence.trim().split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words in the sentence: " + wordCount);
    }
}
