import java.util.*;

//This is tha base class.
class staff
{
    Scanner sc = new Scanner(System.in);
    int code;
    String name,add;
    void setData()
    {
        System.out.println("Enter the Code, Name and Address : ");
        code = sc.nextInt();
        name = sc.next();
        add = sc.next();        
    }
    void getData()
    {
        System.out.println("Code: "+code);
        System.out.println("Name: "+name);
        System.out.println("Address: "+add);
    }
}

class teacher extends staff
{
    Scanner sc = new Scanner(System.in);
    String sub,div;
    void setData()
    {
       super.setData();
       System.out.println("Enter the subject and class: ");
       sub = sc.next();
       div = sc.next();   
    }
    void getData()
    {
        super.getData();
        System.out.println("Subject: "+sub);
        System.out.println("Class: "+div);
    }
}

class officer extends staff
{
    Scanner sc = new Scanner(System.in);
    String grade;
    void setData()
    {
       super.setData();
       System.out.println("Enter the grade: ");
       grade = sc.next();
    }
    void getData()
    {
        super.getData();
        System.out.println("Grade: "+grade);
    }
}

class Typist extends staff
{
    Scanner sc = new Scanner(System.in);
    float speed;
    int chs;
   	
    void setData()
    {
       super.setData();
       System.out.println("Enter the speed: ");
       speed = sc.nextFloat();
    }
    void getData()
    {
        super.getData();
        System.out.println("Speed: "+speed);
    }

}

class Regular extends Typist
{
    Scanner sc = new Scanner(System.in);
    int pay;

    void setData()
    {
       super.setData();
       System.out.println("Enter the Basic Pay of regular typist: ");
       pay = sc.nextInt();
    }
    void getData()
    {
        super.getData();
        System.out.println("Basic Pay: "+pay);
    }
}

class AdHoc extends Typist
{
    Scanner sc = new Scanner(System.in);
    int pay;

    void setData()
    {
       super.setData();
       System.out.println("Enter the Basic Pay of Ad-Hoc: ");
       pay = sc.nextInt();
    }
    void getData()
    {
        super.getData();
        System.out.println("Basic Pay: "+pay);
    }
}


class inheritance
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);        
        int chs,option;
        
        teacher t = new teacher();
        officer o = new officer();
        Typist ty = new Typist();
		Regular r = new Regular();
		AdHoc a  = new AdHoc(); 
        
        /*t.setData();
        System.out.println();
        t.getData();*/

        /*o.setData();
        System.out.println();
        o.getData();*/   

        /*ty.setData();
        System.out.println();
        ty.getData();*/

        do
        {
			System.out.println();
            System.out.println("1.Teacher");
            System.out.println("2.Officer");
            System.out.println("3.Typist");
            System.out.println("4.Exit");
			System.out.println();
            System.out.println("Enter your choice: ");
            chs = sc.nextInt();
        
            switch(chs)
            {   
                case 1:  t.setData();
                         System.out.println();
                         t.getData();    
                         break;   
                case 2:  o.setData();
                         System.out.println();
                         o.getData();    
                         break;  
                case 3:  System.out.println("1.Regular Pay \n 2.Ad-Hoc");
						 System.out.println("Enter your option: ");
						 option = sc.nextInt();
						 switch(option)
						 {
							case 1: r.setData();
                        			System.out.println();
                         			r.getData(); 
									break;
							case 2: a.setData();
                        			System.out.println();
                         			a.getData(); 
									break;
						 }
						    
                         break;    
                case 4:  System.exit(0);
            }
        }while(chs!=4);
    }
}