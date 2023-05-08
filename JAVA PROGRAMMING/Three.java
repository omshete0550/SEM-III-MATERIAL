import java.lang.*;
class Three
{
	public static void main(String A[])
	{
		int a,b,c,res;
		a = Integer.parseInt(A[0]);
		b = Integer.parseInt(A[1]);
		c = Integer.parseInt(A[2]);

		res = (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("Greatest of "+a+","+b+","+c+" is: "+res);
	}
}