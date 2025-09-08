
package Assighnments.TestAssignment;
import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
        if(birthYear > currentYear) {
            System.out.println("You haven't been born yet!");
        }
        sc.close();
    }
}