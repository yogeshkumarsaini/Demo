package Day10.Dissarium_Number;

import java.util.Scanner;

public class Dissarium {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = sc.nextInt();
        if(checkDissarium(a)==a){
            System.out.println("It is a dissarium number");
        }
        else{
            System.out.println("It is not a dissarium number");
        }
        sc.close();
    }
    public static int checkDissarium(int n){
        int a=n;
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        int p=0;
        while(a>0){
            int rem =a%10;
            p=p+(int)(Math.pow(rem, count));
            a=a/10;
            count--;
        }
        return p;
    }
}
