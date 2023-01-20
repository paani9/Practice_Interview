package mock;

public class C_N_SC {
	public static void main(String[] args)
	{
		String s="A%12#C";
		String num="";
		String alp="";
		String sch="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			if(c>='0'&&c<='9')
			{
				
			num=num+c;
				
			}
			else if((c>='A'&& c<='Z')||(c>='a'&&c<='z'))
			{
				alp=alp+c;
			}
			else
			{
				
				sch=sch+c;
			}
			
			
		}
		System.out.print("number"+" "+num);
		System.out.println();
		System.out.print("alphbets"+" "+alp);
		System.out.println();
		System.out.println("special characters"+" "+sch);
	}

}
