package Day6.ElectricMeterUnit;

import java.util.Scanner;

public class BillCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units ");
        int n=sc.nextInt();

        int result=(n<=100) ? n*2 :((n>=101 && n<=150) ? (200+(n-100)*3) : ((n>=151 && n<=200) ? (350+(n-150)*4) : ((n>=201 && n<=250) ? (550+(n-200)*5) : ((n>=251 && n<=300) ? (800+(n-250)*6) :((n>=301 && n<=500) ? (1100+(n-300)*7) :(n>=501)?(2500+(n-500)*8):0)))));
        System.out.println(result);
    }
}
