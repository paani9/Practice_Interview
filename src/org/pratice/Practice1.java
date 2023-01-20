package org.pratice;


import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

abstract class Dat implements Comparable,Comparator{
	int number;
	Dat(int number)
	{
		this.number=number;
	}
	

	
	public int compare(Dat d1,Dat d2) {
		return d2.number-d1.number;
	}

	
	public int compareTo(Dat d) {
		return number-d.number;
	}
	
	
}

public class Practice1 {
	
	
	public static void main(String[] args)
	{ 
		Dat d1=new Dat(2);
		Dat d2=new Dat(3);
		Dat d3=new Dat(1);
		TreeSet set=new TreeSet<>(d3);
		set.addAll(List.of(d1,d2,d3));
		System.out.println(set.higher(d1).number);
		
	}
}
