import java.util.Scanner;

class Matrix 
{
	void square(int m, int n, int[][] a) 
  	{
    	if (m == n)
     	 System.out.println("Matrix is a square matrix.");
    	else
     	 System.out.println("Matrix is not a square matrix.");
 	 }
  
  	int Sum(int a, int b, int[][] arr)
	{
		int sum=0;
		for(int i=0;i<a;i++)
  		{ 
	   		for(int j=0;j<b;j++)
	    	{ 
				if(i==j)	
				{
					sum = sum + arr[i][j];
				}
    		}
		}
    return sum;
	}
}

class TwoDimMatrix 
{
  public static void main(String args[]).
  {
    Scanner sc = new Scanner(System.in);
    Matrix m = new Matrix();
    int row, col;

    System.out.println("Enter the number of rows and columns of the matrix: ");
    row = sc.nextInt();
    col = sc.nextInt();
    int arr[][] = new int[row][col];

    System.out.println("Enter the matrix elements: ");
    for (int i = 0; i < row; i++)
	{
      for (int j = 0; j < col; j++) 
	  {
        arr[i][j] = sc.nextInt();
      }
    }

    System.out.println("Matrix: ");
    for (int i = 0; i < row; i++) 
	{
      for (int j = 0; j < col; j++) 
	  {
        System.out.print(+arr[i][j] + " ");
      }
      System.out.println();
    }

    m.square(row, col, arr);
    
    System.out.println("Sum of the diagoanl elements of matrix is "+m.Sum(row, col, arr));
  }
}





				