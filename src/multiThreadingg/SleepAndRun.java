package multiThreadingg;
import java.util.*;

class A extends Thread
{
	
 public  void run()
	{
		try
		{
	for(int i=0;i<9;i++)
	{
		System.out.println(i);
		Thread.sleep(1000);
	}
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e);
		}	
	}
}

class B extends Thread
{
public void run()
{
	try {
		for(int i=10;i<20;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
			//stop();     for stop thread excecutoin 
		}
	}catch(Exception e)
	{
		System.out.println("Excteption is"+e);
	}	
}
}


public record SleepAndRun() {
public static void main(String[] args)throws InterruptedException {
	
	A obj=new A();
	obj.start();
	//System.out.println(obj.isAlive());

	//obj.join(); // stop one thread until one thread not complete >> InterruptedException is compulsory

	B obj2=new B();
	//System.out.println(obj.isAlive());

	obj2.start();
}
}
