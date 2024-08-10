package commonProgram;

import java.util.Scanner;


class Bank {
	
	
	synchronized  void account() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.print(i+" ");
			if(i==5) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			}
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				//e.printStackTrace();			}
		}
	}
	
 synchronized void call()
	{
		notifyAll();
	}
	
}

class SBI extends Thread
{
	Bank b;
	 void setBank(Bank b)
	{
		this.b=b;
	}
	
	public void run()
	{
		System.out.println("SBI Bank details");
	
			b.account();
	
	}
}

class PNB extends Thread 
{
	Bank b;
	public void  setBank(Bank b)
	{
		this.b=b;
	}
	
	public void run()
	{
		System.out.println("\nPNB Bank details");

		b.account();

}
	
}


public class RunnableThreadDemo {
	public static void main(String[] args) {

		Bank b = new Bank();
		SBI s=new SBI();
		s.setBank(b);
		s.start();
		
		
		
		PNB p=new PNB();
		p.setBank(b);
		p.start();
		
		
		
		do {
			System.out.println("Enter value");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			if(a==10)
			b.call();
		}while(true);
		
		

	}

}
