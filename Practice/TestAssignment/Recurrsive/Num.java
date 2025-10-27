package Practice.TestAssignment.Recurrsive;

public class Num {
    public static void main(String[] args) {
        System.out.println(binary(37));
        System.out.println(sumOfNumber(5));
        reverseString("Hello");
        System.out.println(f(5));
    }

    private static int sumOfNumber(int n) {
        if(n==0) return 0;
        return n + sumOfNumber(n-1);
    }

    public static int binary(int num){
        if(num==0) return 0;
        return num % 2 + 10*binary(num/2);
    }

    public static void reverseString(String str){
        if(str.length() ==0) return;
        System.out.print(str.charAt(str.length()-1));
        reverseString(str.substring(0,str.length()-1));
    }
    public static int f(int n){
    if (n<=1) return 1;
    System.out.println(n);
    return f(n-1)+f(n-2);
}

}
