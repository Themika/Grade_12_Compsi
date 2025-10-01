package Practice.TestAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class javaMethods {
    public static void wordLength(ArrayList<String> words) {
        for (String word : words) {
            System.out.println("The length of the word \"" + word + "\" is: " + word.length());
        }
    }

    public static int searchForInt(ArrayList<Integer> numbers, int target) {
        if (numbers.contains(target)) {
            System.out.println("Found " + target + " in the list.");
            return 1;
        } else {
            System.out.println("Did not find " + target + " in the list.");
            return -1;
        }
    }

    public static void combineString(String str1, String str2) {
        String combined = str1 + " " + str2;
        System.out.println(combined);
    }

    public static void factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("The factorial of " + n + " is: " + result);
    }

    public static void removeEvens(ArrayList<Integer> numbers) {
        numbers.removeIf(i -> i % 2 == 0);
        System.out.println("List after removing even numbers: " + numbers);
    }

    public static void longestWord(ArrayList<String> words) {
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("The longest word is: " + longest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter the amount of words you want to find the length of: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter word " + (i + 1) + ": ");
            String word = sc.next();
            list.add(word);
        }
        sc.close();
        ArrayList<Integer> numbers = new ArrayList<>(java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        wordLength(list);
        removeEvens(numbers);
        longestWord(new ArrayList<>(java.util.Arrays.asList("apple", "banana", "cherry", "watermelon")));
        combineString("Hello", "World");
        searchForInt(new ArrayList<>(java.util.Arrays.asList(10, 20, 30, 40, 50)), 30);
        factorial(3);
    }
}
