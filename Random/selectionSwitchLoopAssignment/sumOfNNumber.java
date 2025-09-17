package Random.selectionSwitchLoopAssignment;

import java.util.Scanner;

public class sumOfNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to sum up to: ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
