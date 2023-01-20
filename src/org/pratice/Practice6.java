package org.pratice;


import java.util.ArrayList;
import java.util.List;

public class Practice6 {
	
		
	int count(List list)
	{
		return list.size();
	}
	public static void main(String[] args) {
		Practice6 p=new Practice6();
		List l1=List.of("hello");
		List l2=List.of(1,2);
		System.out.println(p.count(l1));
		System.out.println(p.count(l2));
	}
	}


