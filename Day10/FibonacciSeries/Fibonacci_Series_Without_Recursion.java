package Day10.FibonacciSeries;

import java.util.Scanner;

public class Fibonacci_Series_Without_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int n1=0, n2=1;
        for(int i=0;i<n;i++){
            System.out.print(n1+" ");
            int n3=n2+n1;
            n1=n2;
            n2=n3;
        }
    }
}
