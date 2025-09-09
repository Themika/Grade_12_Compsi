package Assighnments.String_Assignment;

public class reverseString {
    public static void main(String[] args) {
        String str = "Hello";
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
