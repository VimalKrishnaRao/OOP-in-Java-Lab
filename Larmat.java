import java.util.*;
class Larmat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[5][5];
		int lar;
		System.out.println("Enter the Matrix Size:");
		int n=sc.nextInt();
		System.out.println("Enter the Matrix:");
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		lar=a[0][0];
		for (int i=0;i<n;i++)
		{
				if (a[i][j]>lar)
					lar=a[i][j];
		}
		System.out.println("Tha largest element in the matrix is:"+lar);
	}
}
