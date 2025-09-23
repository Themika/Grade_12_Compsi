
package Practice.TestAssignment;

import java.util.Map;
import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            // Days in each month for non-leap years
            Map<Integer, Integer> daysInTheYear = Map.ofEntries(
                    Map.entry(1, 31),
                    Map.entry(2, 28),
                    Map.entry(3, 31),
                    Map.entry(4, 30),
                    Map.entry(5, 31),
                    Map.entry(6, 30),
                    Map.entry(7, 31),
                    Map.entry(8, 31),
                    Map.entry(9, 30),
                    Map.entry(10, 31),
                    Map.entry(11, 30),
                    Map.entry(12, 31));
            // User input for birth date
            System.out.println("Welcome to the Age Calculator!");
            System.out.print("Enter your birth year: ");
            int birthYear = sc.nextShort();

            System.out.print("Enter your birth month (1-12): ");
            int birthMonth = sc.nextShort();

            System.out.print("Enter your birth day " + "(1-"
                    + (birthYear % 4 == 0 && birthMonth == 2 ? 29 : daysInTheYear.getOrDefault(birthMonth, 31))
                    + "): ");
            int birthDay = sc.nextShort();

            // Get current Year,Month,Day
            int currentYear = java.time.Year.now().getValue();
            int currentMonth = java.time.LocalDate.now().getMonthValue();
            int currentDay = java.time.LocalDate.now().getDayOfMonth();

            // Basic age calculation
            int age = currentYear - birthYear;

            /// Edge case handling for month and day
            /// If current month and day are before birth month and day, subtract one year
            /// from age
            /// This accounts for whether the birthday has occurred yet this year
            if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
                age--;
            }
            // Input validation and output
            if (birthMonth < 1 || birthMonth > 12) {
                System.out.println("Invalid birth month entered.");
            } else if (birthYear % 4 == 0 && birthMonth == 2 && birthDay == 29) {
                System.out.println("You are " + age + " years old.");
            } else if (birthDay < 1 || birthDay > daysInTheYear.get(birthMonth)) {
                System.out.println("Invalid birth day entered.");
            } else if (birthYear > currentYear) {
                System.out.println("You haven't been born yet!");
            } else if (age < 0 || birthYear < 0) {
                System.out.println("Invalid birth year entered.");
            } else {
                System.out.println("You are " + age + " years old.");
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numeric values for year, month, and day.");
        }
    }
}