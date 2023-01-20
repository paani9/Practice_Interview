package mock;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Remove_Print_duplicates {
	public static void main(String[] args)
	{
	
		int[] arr= {4,8,9,4,9,7,9};
		List<Integer>  list=new LinkedList<Integer>();
		Set<Integer>   set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
			set.add(arr[i]);
		}
		for(int ar:set)
			
		{ int count=0;
			for(int re:list)
			
			{
				if(ar==re)
				{
					
					count++;
				}
				
			}
			if(count>1)
			{
				
				System.out.println("duplicates"+ ar);
				
			}
			
		}
		
		
		System.out.println(set);
		
	}
	

}
