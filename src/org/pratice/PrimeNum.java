package org.pratice;

import java.util.Scanner;

public class PrimeNum {
	
	public static void primeNum(int num)
	{
		int count=0;
		for(int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0 && num!=0 && num!=1)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter Data");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		primeNum(n);
		
	}
}
