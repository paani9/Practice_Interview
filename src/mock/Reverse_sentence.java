package mock;

public class Reverse_sentence {
	public static void main(String[] args)
	{
		String sente="I am String";
		String[] srr=sente.split(" ");
		String rev="";
		for(int i=srr.length-1;i>=0;i--)
		{
			rev=rev+" "+srr[i];
			
		}
		System.out.println(rev);
	}

}
