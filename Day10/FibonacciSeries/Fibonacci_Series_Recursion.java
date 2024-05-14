package Day10.FibonacciSeries;

import java.util.Scanner;

public class Fibonacci_Series_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+" ");
        }
    }
    public static int fibo(int n)
    {
        if (n <= 1)
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
}
