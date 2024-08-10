package multiThreadingg;
import java.util.*;


class Table implements Runnable 
{
	
	public void run()
	{
		
		System.out.println("It is Runnable start method");
	}
	
 
	 
}
public class RunnableThreadPro {
	public static void main(String[] args) {
		
		Table t=new Table();
		Thread d=new Thread(t);
		d.start();

		
		
		
		
		
		
		
	}

}
