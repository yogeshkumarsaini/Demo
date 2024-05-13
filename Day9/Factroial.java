package Day9;

import java.util.Scanner;

public class Factroial {
    public static void  main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x=sc.nextInt();
		while(x>0)
		{
			int rem=x%10;
			findFactorial(rem);
			x=x/10;
		}
	}
	public static void findFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(n+"!= "+fact);
	}	
}
