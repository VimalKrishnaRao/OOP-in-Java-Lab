import java.util.Random;

class RandomNumberThread extends Thread 
{
	public void run() 
	{
		Random random = new Random();
		for (int i = 0; i < 10; i++) 
		{
			int randomInteger = random.nextInt(100);
			System.out.println("Random Integer generated : " + randomInteger);
			if((randomInteger%2) == 0) 
			{
				Even eThread = new Even (randomInteger);
				eThread.start();
			}
			else 
			{
				Odd oThread = new Odd (randomInteger);
				oThread.start();
			}
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				System.out.println(e);
			}
		}
	}
}

class Even extends Thread 
{
	int number;

	Even (int randomNumbern) 
	{
		number = randomNumbern;
	}
    public void run() 
    {
        for (int i=1; i<number;i++)
        if (i%2==0)
		    System.out.println(i);
	}
}

class Odd extends Thread 
{
	int number;

	Odd (int randomNumber) 
	{
		number = randomNumber;
	}
    public void run() 
	{
		for (int i=1; i<number;i++)
        if (i%2!=0)
		    System.out.println(i);
	}
}

public class MultiThreadingTest
{
	public static void main(String args[]) 
	{
		RandomNumberThread rnThread = new RandomNumberThread();
		rnThread.start();
	}
}
