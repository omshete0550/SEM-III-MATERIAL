import java.util.Scanner;

class Transpose
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns of matrix: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
	
		System.out.println("Enter the matrix elements: ");
		for(int i=0; i<row; i++)
		{	
			for(int j=0; j<col; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
	
		System.out.println("Matrix: ");
		for(int i=0; i<row; i++)
		{	
			for(int j=0; j<col; j++)
			{
				System.out.print(+arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Transpose of matrix: ");
		for(int i=0; i<row; i++)
		{	
			for(int j=0; j<col; j++)
			{
				System.out.print(+arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}


		