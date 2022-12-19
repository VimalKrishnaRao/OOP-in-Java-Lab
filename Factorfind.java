import java.util.Scanner;
class Factor
{
    void findfactor (int n)
    {
        System.out.println ("The Factors of "+n+" are:");
        for (int i=1; i<=n; i++)
        {
            if (n%i==0)
                System.out.print(i+"\t");
        }
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the Number:");
            int n = sc.nextInt();
        Factor obj = new Factor();
        obj.findfactor(n);
    }
}
