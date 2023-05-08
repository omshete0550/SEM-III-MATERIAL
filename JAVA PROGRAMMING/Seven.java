class Seven
{
	public static void main(String[] args)
	{
		int i,count=0,sum=0;
		for(i=101; i<200; i++)
		{
			if(i%7==0)
			{
				count++;
				sum=sum+i;
			}
		}
		System.out.println("Total numbers divisible by 7 are: "+count);
		System.out.println("Sum of the all numbers divisible by 7 between 100 to 200 is "+sum);
		
	}
}
	