class OddThread extends Thread 
{
  public void run() 
  {
    for (int i = 1; i <= 100; i += 2) 
    {
      System.out.print(i+” “);
    }
  }
}

class EvenThread extends Thread 
{
  public void run() 
  {
    for (int i = 2; i <= 100; i += 2) 
    {
      System.out.print(i+” “);
    }
  }
}

public class Main 
{
  public static void main(String args[]) 
  {
    OddThread oddThread = new OddThread();
    EvenThread evenThread = new EvenThread();
    oddThread.start();
    evenThread.start();
  }
}
