import java.util.Scanner;

public class BiggestAndSecondbiggest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        checkBiggestAndSecondbiggest(a);
        sc.close();
    }
    public static void checkBiggestAndSecondbiggest(int[] a){
        int biggest=a[0];
        int secondBiggest=Integer.MIN_VALUE;
        for(int i=0; i<a.length;i++){
            if(a[i]>biggest){
                secondBiggest=biggest;
                biggest=a[i];
            }
            else if(a[i]>secondBiggest && a[i]!=biggest){
                secondBiggest=a[i];
            }
        }
        System.out.println("Biggest number in the array are: "+biggest);
        if(secondBiggest!=Integer.MIN_VALUE)
            System.out.println("Second biggest number in the array are: "+secondBiggest);
        else
            System.out.println("There is no second biggest number.");
    }
}

