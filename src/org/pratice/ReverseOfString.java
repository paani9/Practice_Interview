package org.pratice;

import java.util.Scanner;

public class ReverseOfString {
	public static String rev(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		return rev;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter Data");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
	String revStr=rev(s);
	System.out.println(revStr);
	
	}
}

