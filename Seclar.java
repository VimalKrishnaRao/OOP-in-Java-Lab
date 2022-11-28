import java.util.*;
class Seclar
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements:");
		int n=sc.nextInt();
		int lar,seclar,i;
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements:");
		for (i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
    }
    for (i=0;i<n;i++)
    {
			if (arr[i]>lar)
				lar=arr[i];
		}
		for (i=0;i<n;i++)
		{	
			if(arr[i]<lar && arr[i]>seclar)
				seclar=arr[i];
		}
		System.out.println("The Second smallest element in the array is: "+seclar);
	}
}
			
