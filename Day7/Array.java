package Day7;

import java.util.Scanner;
// print the cross diagonal element in 2d array
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 2d array");
        int n = sc.nextInt();
        int m =sc.nextInt();
        System.out.println("Enter the element of the array");
        int[][] a = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j || i+j==m-1)
                System.out.print(a[i][j]+" ");
                else
                System.out.print(" ");
            }
            System.out.println();
        }      

    }
}
