
package Assighnments.Assignment_1;

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
    static void Rectangle(int length, int width) {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Rohmbus(5, 5);
        Diamond(5);
        Triangle(5);
        Square(5);
        Rectangle(10, 15);
    }
}