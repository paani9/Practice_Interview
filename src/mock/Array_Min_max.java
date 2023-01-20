package mock;

public class Array_Min_max {
	public static void main(String[] args)
	
	{
		int[] arr= {1,8,9,4,4};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
				
				
			}
			System.out.println(arr[i]);
			
		}
		System.out.println("minimum"+" "+arr[0]);
		System.out.println("maximum"+" "+arr[arr.length-1]);
		
			
		
		
	}
	

}
