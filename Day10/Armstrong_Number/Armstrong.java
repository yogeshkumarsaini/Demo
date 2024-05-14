package Day10.Armstrong_Number;

import java.util.Scanner;

public class Armstrong {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if(checkArmstrong(a)==a)
            System.out.println("It is a Armstrong Number");
        else
            System.out.println("It ia not a Armstrong Number");  
        sc.close();
    }
    public static int checkArmstrong(int n){
        int a=n;
        int count=0;
        while(n>0){
            int rem = n%10;
            count++;
            n=n/10;
        }
        int sum=0;
        while(a>0){
            int rem = a%10;
            sum=sum+(int)(Math.pow(rem, count));
            a=a/10;
        }
        return sum;
    }
}
