package Practice.TestAssignment;

import java.util.ArrayList;

public class Recurssive {
    public static int sumOfAllValue(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return 0;
        } else {
            return numbers.get(0) + sumOfAllValue(new ArrayList<>(numbers.subList(1, numbers.size())));
        }
    }
    public static void reverseString(String str){
        if(str.length()==0){
            System.out.print(str);
            return;
        }
        String firstChar= String.valueOf(str.charAt(0));
        String remainingString= str.substring(1);
        reverseString(remainingString);
        System.out.print(firstChar);
    }
    
    public static void converToBinary(int n){
        if(n==0){
            return;
        }
        if(n > 0){
            converToBinary(n/2);
            System.out.print(n%2);
        }
        else{
            System.out.print("Invalid input DO better lil bro");
        }
    }
    public static void fibonacci(int n){
        if(n==0){
            System.out.print(0);
            return;
        }
        if(n==1){
            System.out.print(1);
            return;
        }
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void fibonacciRec(int n){
        if(n==0){
            System.out.print(0);
            return;
        }
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(fibonacciRecHelper(n)+" ");
    }
    public static int fibonacciRecHelper(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecHelper(n - 1) + fibonacciRecHelper(n - 2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int sum = sumOfAllValue(numbers);
        System.out.println("Sum of all values: " + sum);
        System.out.print("Reversed string: ");
        reverseString("Hello World");
        System.out.println();
        converToBinary(-45);
        System.out.println();
        fibonacciRec(10);
        System.out.println();
        fibonacci(10);

    }
}
