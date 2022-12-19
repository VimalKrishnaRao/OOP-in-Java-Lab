import java.util.Scanner;
class Multmat
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Order of 1st Matrix: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println ("Enter the Order of 2nd Matrix: ");
        int c = sc.nextInt();
        int d = sc.nextInt();
        int m1[][]=new int [a][b];
        int m2[][]=new int [c][d];
        System.out.println ("Enter 1st Matrix:");
            for (int i=0; i<a; i++)
                for (int j=0; j<b; j++)
                    m1[i][j]=sc.nextInt();
        System.out.println ("Enter 2nd Matrix:");
            for (int i=0; i<c; i++)
                for (int j=0; j<d; j++)
                    m2[i][j]=sc.nextInt();
        if (b==c)
        {
            int m3[][]=new int[a][d];
            System.out.println ("The Final Product Matrix is: ");
            for (int i=0; i<a; i++)
            {
                for (int j=0; j<d; j++)
                {
                    m3[i][j]=0;
                    for (int k=0; k<b; k++)
                        m3[i][j]+=m1[i][k]*m2[k][j];
                    System.out.print (m3[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println ("Give matrices cannot be multiplied");
    }
}
