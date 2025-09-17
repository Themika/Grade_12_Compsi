package Random.selectionSwitchLoopAssignment;
import java.util.Scanner;
public class simpleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Select operation: +, -, *, /, %");
        char op = sc.next().charAt(0);
        sc.close();

        switch (op) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                System.out.println("Division: " + (a / b));
                break;
            case '%':
                System.out.println("Modulus: " + (a % b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
