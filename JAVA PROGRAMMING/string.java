import java.util.*;

class string
{
	public static void main(String[] args)
	{
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a string: ");
   		String str = sc.nextLine();
   		int upc=0,lwc=0,sp=0,digit=0,bl=0;
    	int len = str.length();

    	for(int i=0;i<len;i++)
    	{
        	char ch = str.charAt(i);
        	if(ch>='A' && ch<='Z')
        	{
            	upc++;
        	}
        	else if(ch>='a' && ch<='z')
        	{
            	lwc++;
        	}
        	else if(ch=='!' || ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&' || ch=='*')
        	{
            	sp++;
        	}
        	else if(ch>='0' && ch<='9')
      		{
         	   digit++;        
        	}
			else if((int)ch == 32)
			{
 				bl++;
			}
    }

    System.out.println("No. of Uppercase letters: "+ upc);
    System.out.println("No. of Lowercase letters: "+ lwc);
    System.out.println("No. of Special letters: "+ sp);
	System.out.println("No. of Digits: "+digit);
	System.out.println("No. of Blank Spaces: "+ bl);
	}
}