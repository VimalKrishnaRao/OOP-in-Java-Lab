import java.util.*;
class Replace
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter how many elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		System.out.println("Enter the element to be replaced:");
		int a=sc.nextInt();
		System.out.println("Enter the element with which "+a+" has to be replaced:");
		int b=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a==arr[i])
				arr[i]=b;
		}
		System.out.print("The Resulting Array is: ");
		for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	}
}
