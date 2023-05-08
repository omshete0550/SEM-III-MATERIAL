import java.util.*;
class data
{
		int a,b,c,max;
		
		void getData()
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the first number: ");
			a = sc.nextInt();
			System.out.println("Enter the second number: ");
			b = sc.nextInt();
			System.out.println("Enter the third number: ");
			c = sc.nextInt();
		}

		int display()
		{
			max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
			return max;	
		}
}

class MAX
{
	public static void main(String A[])
	{
		
		data obj1 = new data();
		obj1.getData();
		System.out.println("Greatest Among these three:  "+obj1.display());
	}
}
