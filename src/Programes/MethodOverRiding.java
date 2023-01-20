package Programes;


class Bank {
String getRateOfInterest()
{
	
	return "Bank";
}
}

 class SBI extends Bank
{

	 String getRateOfInterest()
	 {
	 	return "SBI Bank";
	 }

}
 

 class ICICI extends Bank
{

	 String getRateOfInterest()
	 {
	 	return "ICICI Bank";
	 }
	 

}


public class MethodOverRiding
{
	public static void main(String[] args)
	{
	
		SBI s=new SBI();
		ICICI i=new ICICI();
		String var=s.getRateOfInterest();
		System.out.println(var);
		var=i.getRateOfInterest();
		System.out.println(var);
		
	}

	


	
}
