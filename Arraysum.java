import java.util.*;
class Arraysum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many elements:");
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("The Sum of elements of the entered array is: "+sum);
	}
}
