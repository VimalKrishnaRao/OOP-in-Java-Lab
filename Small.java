import java.util.*;
class Small
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int small;
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
    }
    small=a[0];
    for (int i=0;i<n;i++)
    {
			if(arr[i]<small)
				small=arr[i];
		}
		System.out.println("The Smallest element of the array is: "+small);
	}
}
