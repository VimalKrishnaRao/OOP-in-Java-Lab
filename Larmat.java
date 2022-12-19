import java.util.Scanner;
class Larmat
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Matrix Size: ");
        int n = sc.nextInt();
        int a[][]=new int [n][n];
        System.out.println ("Enter an "+n+"X"+n+" Matrix:");
            for (int i=0; i<n; i++)
                for (int j=0; j<n; j++)
                    a[i][j]=sc.nextInt();
        int lar = a[0][0];
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                if (lar<a[i][j])
                    lar = a[i][j];
        System.out.println ("The Largest Element in the Matrix is: "+lar);
    }
}
