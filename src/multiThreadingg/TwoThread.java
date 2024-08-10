package multiThreadingg;
import java.util.*;
class M 
{
	M m;
	synchronized void show(int no)
	{

		try {
		for(int i=1;i<11;i++)
		{
			System.out.println(i*no);
			if(i==3)
			{System.out.println("waiting for notify or calling");
				wait();
			}
			Thread.sleep(1000);
			

		}
		}catch(Exception e)
		{
			System.out.println("M class exception");
		}
	}
	
	synchronized void recall(){
try {
	notifyAll();
	
}catch(Exception e)
{
	System.out.println("recall"+ e);
}

	}
	
}

class N extends  Thread // if we not extends with thread then our start() 
                        //method can not be support when we start.
{
M m;
	void setM(M m)
	{
		this.m=m;
	}
	
public void run()
	{
		m.show(10);
	}

}

class O extends Thread
{
	M m;
	void setO(M m)
	{
		this.m=m; 	
	}
	
public  void run()
	{
		m.show(5);
	}
}

public class TwoThread {
	public static void main(String[] args) throws InterruptedException  {
		Scanner sc=new Scanner(System.in);
		int no;
		O o=new O();

		M m=new M();
		
		N n=new N();
		n.setM(m);
		n.start();
		//n.join();
		o.setO(m);
		o.start();
		do {
//			System.out.println("enter anuber");
//			no=sc.nextInt();
//			if(no==5) {
//			m.recall();	
//			}
			m.recall();
		}while(true);

		
		
		
	}

}
