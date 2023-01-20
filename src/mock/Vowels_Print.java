package mock;

public class Vowels_Print {
	
	public static void main(String[] args)
	{
		String s="i am String";
		String[] sp=s.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			char c=sp[i].charAt(0);
			
			if(c =='a'||c=='e'||c=='i'||c=='o'||c=='u'||c =='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				System.out.println(sp[i]);
				
			}
		}
	}
	
	
	
	

}
