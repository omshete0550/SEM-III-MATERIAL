/*import java.util.*;
class Employee
{
	
	int id;
	String name;
	int salary;
	void getData()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name: ");
		name = sc.next();

		System.out.println("Enter ID: ");
		id = sc.nextInt();
		
		System.out.println("Enter Salary: ");
		salary = sc.nextInt();
	}
	void display()
	{
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	public static void main(String args[])
	{
		Employee e = new Employee();
		e.getData();
		System.out.println("Employee Details are: ");
		e.display();
	}
}*/




import java.util.*;

class Details{
		int id, hours, wages;
		String name;
		Scanner sc = new Scanner(System.in);
		
	void setData(){
		System.out.print("Enter the id: ");
		id = sc.nextInt();
		
		System.out.print("Enter name: ");
		name = sc.next();
		
		System.out.print("Enter the number of hours worked: ") ;
		hours = sc.nextInt();
		
		wages = 100*hours;
	}
	
	void getData(){
		System.out.println(id+"\t\t\t"+name+"\t\t\t"+hours+"\t\t\t\t"+wages);
	}
}

class Employee{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Employee");
		int n = sc.nextInt();
		
		Details arr[] = new Details[n];
		for(int i=0; i<n; i++){
			arr[i] = new Details();
			arr[i].setData();
		}
		
		System.out.println("Id\t\t\tName\t\t\tHours\t\t\t\tWages");
		for(int i=0; i<n; i++)
			arr[i].getData();
	}
}
