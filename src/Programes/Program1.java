package Programes;

import java.lang.reflect.Array;
import java.util.LinkedList;

import org.pratice.Practice1;

public class Program1 {
	public static void main(String[] args)
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("H");
		l.add("M");
		String[] a=l.toArray(new String[l.size()]);
		for(int i=0;i<a.length;i++)
				{
			
			System.out.println(a[i]);
				}
	}
	
	

}
