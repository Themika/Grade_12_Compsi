package Practice.TestAssignment.Miscellaneous;

import java.util.Scanner;

public class promptThing {
    public static int checkNumber(int prompt, int min, int max) {
        if (prompt >= min && prompt <= max) {
            System.out.println(prompt + " is within the range of " + min + " and " + max);
        } else {
            System.out.println(prompt + " is out of range");
        } return prompt;  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int prompt = sc.nextInt();
        System.out.print("Enter minimum number: ");
        int min = sc.nextInt();
        System.out.print("Enter maximum number: ");
        int max = sc.nextInt();
        checkNumber(prompt, min, max);
        sc.close();
    }
}
