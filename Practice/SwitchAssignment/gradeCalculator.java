package Practice.SwitchAssignment;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        sc.close();
        char grade;

        if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'B';
        } else if (marks >= 60 && marks <= 69) {
            grade = 'C';
        } else if (marks >= 50 && marks <= 59) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Marks: " + marks + ", Grade: " + grade);
    }    
}
