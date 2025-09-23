package Practice.selectionSwitchLoopAssignment;
import java.util.Scanner;
public class multiplyTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to display its multiplication table: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 12; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
