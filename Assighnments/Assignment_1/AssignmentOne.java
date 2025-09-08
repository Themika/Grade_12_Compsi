
package Assighnments.Assignment_1;

import java.util.Scanner;

class AssignmentOne {
    static void Rohmbus(int length, int width) {
        for (int i = 1; i <= width; i++) {
            for (int j = width; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= length; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Diamond(int n) {
        int space = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            for (int j = 1; j <= 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Square(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Rectangle(int length, int width, String item) {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print(item);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your shape choice   (Rohmbus, Diamond, Triangle, Square, Rectangle): ");
        String shape = scanner.nextLine();
        shape = shape.toLowerCase();

        System.out.print("Enter length ");
        short length = scanner.nextShort();

        System.out.print("Enter the width (for Diamond and Triangle, width will be ignored): ");
        short width = scanner.nextShort();

        if (shape.equals("rohmbus")) {
            Rohmbus(length, width);
        } else if (shape.equals("diamond")) {
            Diamond(length);
        } else if (shape.equals("triangle")) {
            Triangle(length);
        } else if (shape.equals("square")) {
            Square(length);
        } else if (shape.equals("rectangle")) {
            Rectangle(length, width, "*");
        } else {
            System.out.println("Invalid shape choice.");
        }
        scanner.close();
    }
}