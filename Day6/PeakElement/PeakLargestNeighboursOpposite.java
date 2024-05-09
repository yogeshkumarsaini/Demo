package Day6.PeakElement;

import java.util.Scanner;

public class PeakLargestNeighboursOpposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Peak element in the array are: "+checkElement(a));
        
        sc.close();
    }
    public static int checkElement(int[] a){
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] < a[i - 1] && a[i] < a[i + 1]) {
                return a[i];
            }
        }
        return -1;
    }
}
