class EvenOdd
{
	public static void main(String []args)
	{
		int arr[] = {10,22,53,80,55,30};
		int count=0, count1=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		
		System.out.println("Total even numbers present in the array are "+count);
		System.out.println("Total odd numbers present in the array are "+count1);
	}
}	
		