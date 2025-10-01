package Practice.TestAssignment;

import java.util.ArrayList;
public class Bug3 {
    public static void main(String[] args) {
        // int[] arr = {80, 90, 100, 70, 85};
        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        // }
        // int average = sum / arr.length;
        // System.out.println("Average: " + average);

        // System.out.println("5! + " + factorial(5));

        // ArrayList<String> words = new ArrayList<>();
        // words.add("apple");
        // words.add("banana");
        // System.out.println("Longest word: " + findLongestWord(words));

        // System.out.println(isEven(4));

        // ArrayList<Integer> nums = new ArrayList<>();
        // for (int i = 1; i <= 10; i++) {
        //     nums.add(i);
        // }
        // for(int i =0; i < nums.size(); i++) {
        //     if(nums.get(i) % 2 == 0) {
        //         nums.remove(i);
        //         i--; // Adjust index after removal
        //     }
        // }

        int scores[] = {80, 90, 100, 70, 85};
        int total = 0;
        for(int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        double average = total / scores.length;
        System.out.println("Average: " + average);
        
    }
    public static String findLongestWord(ArrayList<String> words) {
        String longest = " ";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
    public static int maxValue(int[] nums) {
        int max = 0;
        for(int n: nums) {
            if(n > max) {
                max = n;
            }
        }
        return max;
    }
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static int doubleInt(int n) {
        return n * 2;
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
