package multiThreadingg;

class One 
{
	public void show(int a)
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(a*i);
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}
	
}

class Two2 extends Thread
{
	One o;
	
	public void setOb(One o)
	{
	this.o=o;	
	}
	
	public void run() {
		o.show(1);
	}
	
}



class Three3 extends Thread
{
	One o;
	
	public void setOb(One o)
	{
	this.o=o;	
	}
	
	public void run() {
		o.show(20);
	}
	
	
	
	
}

public class MultiTProgram {
public static void main(String[] args) {
	
	One o=new One();
	
	Two2 t=new Two2();
	t.setOb(o);
	t.start();
	
	Three3 t2=new Three3();
	t2.setOb(o);
	t2.start();
	
	
	
}
}
