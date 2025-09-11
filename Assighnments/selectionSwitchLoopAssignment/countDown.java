package Assighnments.selectionSwitchLoopAssignment;

import java.util.Scanner;

public class countDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to start countdown from: ");
        int start = sc.nextInt();
        sc.close();
        for (int i = start; i > 0; i--) {
            try {
                Thread.sleep(500); // Pause for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("Blast off!");
    }
}
