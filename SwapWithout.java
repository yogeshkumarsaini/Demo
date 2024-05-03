import java.util.Scanner;
// Without using arithmetic opertaion
public class SwapWithout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b:");
        int b= sc.nextInt();
        swap(a,b);
        sc.close();
    }
    public static void swap(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Swapped a is : "+a);
        System.out.println("Swapped b is : "+b);
    }
    
}
