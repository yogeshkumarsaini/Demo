package Day10.Factroial_Number;

import java.util.Scanner;

public class Factroial_Recursion {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int x=sc.nextInt();
		System.out.println(x+"! is: "+getFact(x));
	}
	public static int getFact(int n)
	{
		if(n>1)
			return n*getFact(n-1);
		else
			return n;
	}
}
