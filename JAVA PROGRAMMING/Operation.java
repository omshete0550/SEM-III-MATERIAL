import calculator.*;

class Operation
{
	public static void main(String args[])
	{
		Add a = new Add();	
		System.out.println("Addition: "+a.add(45,29));

		Sub s = new Sub();	
		System.out.println("Substraction: "+s.sub(45,29));

		Mult m = new Mult();	
		System.out.println("Multiplication: "+m.mult(5,9));

		Div d = new Div();	
		System.out.println("Division: "+d.div(63,9));
	}
}