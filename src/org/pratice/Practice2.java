package org.pratice;

public class Practice2 {

	int employeeid;
	String employeeName;
	String department;
	
	public Practice2(int employeeid,String employeeName,String department)
	{
		this.employeeid=employeeid;
		this.employeeName=employeeName;
		this.department=department;
		
	}
	
	public static void main(String[] args)
	{
		Practice2 r = new Practice2(1,"p","E");
		System.out.println(r.employeeid);
		Practice2 n=new Practice2(2,"s","k");
		System.out.println(n.employeeid);
		
		
		
		
		
		
	}
	
	
	
}
