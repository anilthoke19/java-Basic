package exceptionn;

import java.util.InputMismatchException;

public class CatchRepeat {
	
	void display()
	{
		
		try {
			int a;
			a=10/0;
		}catch(InputMismatchException inp)
		{
			System.out.println("input mismatch");
		
		}
		
		catch(ArithmeticException ar) {
			
			
			System.out.println("arith");
		}finally {
			System.out.println("finall block");
		}
		
		System.out.println("out of try and catch");
	}
	

	public static void main(String[] ar)
	{
		CatchRepeat c=new CatchRepeat();
		c.display();
		
	}
}
