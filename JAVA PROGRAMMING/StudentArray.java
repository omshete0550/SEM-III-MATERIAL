
import java.util.*;

class Student{
		int p, c, m, total;
		String name;
		Scanner sc = new Scanner(System.in);
		
	void setData(){
		System.out.print("Enter name: ");
		name = sc.next();
		
		System.out.print("Enter the Physics marks: ");
		p = sc.nextInt();
		
		System.out.print("Enter the Chemistry marks: ") ;
		c = sc.nextInt();
		
		System.out.print("Enter the Maths marks: ") ;
		m = sc.nextInt();
		
		total = p+c+m;
	}
	
	void getData(){
		System.out.println(name+"\twith total marks: "+total);
	}
}

class StudentArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Student");
		int n = sc.nextInt();
		
		Student arr[] = new Student[n];
		for(int i=0; i<n; i++){
			arr[i] = new Student();
			arr[i].setData();
		}
		
		int max=0, max_id=-1;
		for(int i=0; i<n; i++){
			if(arr[i].total>max){
				max = arr[i].total;
				max_id = i;
			}
		}
		
		System.out.println("Student with Maximum total Score is: ");
		arr[max_id].getData ();
		
	}
}
		
		