package multiThreadingg;

import java.nio.channels.AsynchronousChannel;
import java.util.Scanner;

class FirstTable
{
	//synchronized public void tableLine(int a)
   synchronized	public void tableLine(int a)
	{
		
		for(int i=1;i<11;i++)
		{
			System.out.println(i*a);
			try {
				//Thread.sleep(1000);
				if(i==3) {
				wait();}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
   
  synchronized public void recall()
   {
	   notify();
   }
   
	
}

class Ten extends Thread
{
	FirstTable t=new FirstTable();
	
	public void  setTableObj(FirstTable f)
	{
		t=f;
	}
	
	public void run()
	{
		t.tableLine(10);
		
		
	}
	
	
}


class Five extends Thread
{
	FirstTable t=new FirstTable();

	public void  setTableObj(FirstTable f)
	{
		t=f;
	}
	
	public void run()
	{
		t.tableLine(5);
		
		
		
	}
	
	
	
}


public class SynchronizationThreadPro {

	public static void main(String[] args) {
		FirstTable f2=new FirstTable();
		
		Ten t=new Ten();
		t.setTableObj(f2);
		t.start();
		
		Five f=new Five();
		f.setTableObj(f2);
		f.start();
		
		
		do {
			
			Scanner sc=new Scanner(System.in);
			 System.out.println("Enter number name anil ");
			 String  no=sc.nextLine();
			 
			 if("anil".equalsIgnoreCase(no))
			 {
				 f2.recall();

			 }
			f2.recall();
			
		}while(true);
		
		
		
	}
}
