import java.io.*;
class Percentage
{
	public static void main(String[] args) throws Exception
	{	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter your grade: ");
		char c = (char)br.read();
		
		if(c=='A')
		{
			System.out.println("Percentage: 91-100%");
		}
		else if(c=='B')
		{
			System.out.println("Percentage: 81-90%");
		}
		else if(c=='C')
		{
			System.out.println("Percentage: 71-80%");
		}
		else if(c=='D')
		{
			System.out.println("Percentage: 61-70%");
		}
		else if(c=='F')
		{
			System.out.println("Percentage: 0-60%");
		}
		else
		{
			System.out.println("Invalid input");
		}
		
	}
}