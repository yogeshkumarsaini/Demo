package Day6.PeakElement;

import java.util.Scanner;

public class peakSmallestNeighbours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        checkElement(a);
        sc.close();
    }
    public static void checkElement(int[] a){
        for (int j = 1; j <a.length-1; j++) {
            if (a[j]>a[j-1] && a[j]>a[j+1]){
                System.out.println(a[j]);
                break;
            }
        }
    }
}
