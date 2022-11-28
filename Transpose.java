import java.util.*;
class Transpose
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int o[][]=new int[5][5];
		int m[][]=new int [5][5];
		System.out.println("Enter the order of the matrix:");
		int row=sc.nextInt();
		int coloumn=sc.nextInt();
		System.out.println("Enter the Matrix:");
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<coloumn;j++)
			{
				o[i][j]=sc.nextInt();
				m[i][j]=o[j][i];
			}
		}
		System.out.println("The Inputed Matrix is:");
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<coloumn;j++)
			{
				System.out.print(o[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The Transpose Matrix is:");
		for (int i=0;i<row;i++)
		{
			for (int j=0;j<coloumn;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}
