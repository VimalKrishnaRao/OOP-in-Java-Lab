import java.util.*;
class Addmat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m1[][]=new int[5][5];
		int m2[][]=new int[5][5];
		int m3[][]=new int[5][5];
		System.out.println("Enter Number of Rows & Coloumns:");
		int row=sc.nextInt();
		int coloumn=sc.nextInt();
		System.out.println("Enter 1st Matrix:");
		for(int i=1;i<=row;i++)
			for(int j=1;j<=coloumn;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		System.out.println("Enter 2nd Matrix:");
		for(int i=1;i<=row;i++)
			for(int j=1;j<=coloumn;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		for(int i=1;i<=row;i++)
			for(int j=1;j<=coloumn;j++)
			{
				m3[i][j]=m1[i][j]+m2[i][j];
			}
		System.out.println("The Final Sum Matrix is:");
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=coloumn;j++)
			{
				System.out.print(m3[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
				
