package Day6.Sorting;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array");
        int[] a = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        getShift(a);
        sc.close();
    }
    public static void getShift(int[] a){
        int[] b= new int[a.length];
        int count_1=0;
        int count_2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count_1++;
            }
            else if(a[i]==2){
                count_2++;
            }
        }
        int n=b.length-1;
        for(int i=0; i<b.length;i++){
            if(count_2>0){
                b[i]=2;
                count_2--;
            }
            else if(count_1>0){
                b[n]=1;
                count_1--;
                n--;
            }
            if(count_1==0 && count_2==0)
				break;
        }
        for(int i=0; i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
