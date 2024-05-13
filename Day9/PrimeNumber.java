package Day9;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        if (checkPrime(a)) 
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");        
        sc.close();
    }
    public static boolean checkPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
   }
}