import java.util.Scanner;
// check the given number is palindrome or not
public class method_Example {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a= sc.nextInt();
        if(checkPalindrome(a)){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("It is not a palindrome.");
        }
        sc.close();
    }
    public static boolean checkPalindrome(int n){
        int a=n;    int rev=0;
        while(n>0){
            int rem = n%10;
            rev=10*rev+rem;
            n=n/10;
        }

        return rev==a?true:false;
    }
}


