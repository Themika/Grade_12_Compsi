package Practice.TestAssignment.Recurrsive;

public class Num {
    public static void main(String[] args) {
        System.out.println(sumOfNumber(5));
    }

    private static int sumOfNumber(int n) {
        if(n==0) return 0;
        return n + sumOfNumber(n-1);
    }

    
}
