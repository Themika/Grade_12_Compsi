
package Random.Assignment_1;

import java.util.Scanner;

class AssignmentOne {
    static void Rohmbus(int length, int width, String item) {
        for (int i = 1; i <= width; i++) {
            for (int j = width; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= length; k++) {
                System.out.print(item);
            }
            System.out.println();
        }
    }

    static void Diamond(int n,String item) {
        int space = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space--;
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(item);
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
                System.out.print(item);
            }
            System.out.println();
        }
    }

    static void Triangle(int n, String item) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(item);
            }
            System.out.println();
        }
    }

    static void Square(int n, String item) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(item);
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
        try (scanner) {
            System.out.print("Enter your shape choice (Rohmbus, Diamond, Triangle, Square, Rectangle) or (1-5): ");
            String shape = scanner.nextLine();
            shape = shape.toLowerCase();
            System.out.print("Enter length ");
            short length = scanner.nextShort();
            
            short width = 0;
            if(shape.equals("rohmbus") || shape.equals("rectangle") || shape.equals("1") || shape.equals("5")){
                System.out.print("Enter the width: ");
                width = scanner.nextShort();
            }
            System.out.print("Enter the item to be used in the shape (for Rohmbus, Diamond, Triangle, and Square, '*' will be used): ");
            String item = scanner.next();
            item = item.toLowerCase();
            

            if (shape.equals("rohmbus")|| shape.equals("1")) {
                Rohmbus(length, width, item);
            } else if (shape.equals("diamond")|| shape.equals("2")) {
                Diamond(length, item);
            } else if (shape.equals("triangle")|| shape.equals("3")) {
                Triangle(length, item);
            } else if (shape.equals("square")|| shape.equals("4")) {
                Square(length, item);
            } else if (shape.equals("rectangle")|| shape.equals("5")) {
                Rectangle(length, width, item);
            } else {
                System.out.println("Invalid shape choice.");
            }
        }catch (Exception e) {
            System.out.println("An error occurred while closing the scanner.");
        }

        scanner.close();
    }
}