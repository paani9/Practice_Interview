package org.pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class AA_b_CC_AA_CC__CC_AA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.println("Enter size");
		int size=sc.nextInt();
		String[] s=new String[size];
		for(int i=0;i<size;i++)
		{
			s[i]=sc.next();
		}
		
		
//		for(int i=0;i<size;i++)
//		{
//			System.out.println(s[i]);
//		}
//		
		
	Map<String,Integer>	map=new TreeMap<String,Integer>();
		for(String str:s)
		{
			if(!map.containsKey(str))
			{
			map.put(str,1);
			}
			else
			{
				int count=map.get(str);
				map.put(str,count+1);
			}
		}
		for(Entry<String,Integer> st:map.entrySet() )
		{
			
			
			
			
			if(st.getValue()>2)
			{
				System.out.println(st.getKey());
				
				
				break;
			
		
		}
			
		
		
		
		
		
		
		}
	}

}
