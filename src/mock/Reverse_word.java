package mock;

public class Reverse_word {
	public static void main(String[] args)
	{
		String word="String";
		String rev="";
		for(int i=word.length()-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}
		System.out.println(rev);
	}

}
