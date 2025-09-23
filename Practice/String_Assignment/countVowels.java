package Practice.String_Assignment;
public class countVowels {
    public static void main(String[] args) {
        String input = "Hello World";
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
        }
        String str = "Computer";
        String subStr = str.substring(3, 6);

        System.out.println("Substring: " + subStr);
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
