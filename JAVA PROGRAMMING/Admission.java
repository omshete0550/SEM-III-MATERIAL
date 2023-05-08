import java.io.*;
class Admission
{
	public static void main(String[] args) throws Exception
	{	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter the marks of physics, chemistry, maths");
		int phy = Integer.parseInt(br.readLine());
		int chem = Integer.parseInt(br.readLine());
		int maths = Integer.parseInt(br.readLine());
		int total;
		total=phy+chem+maths;

		if(maths>=60 && phy>=50 && chem>=40 && total>=200)
		{
			System.out.println("Student is eligible to get an admission");
		}
		else
		{
			System.out.println("Student is not eligible to get an admission");
		}
	}
}