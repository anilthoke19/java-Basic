package exceptionn;

import java.util.InputMismatchException;

class Prodect
{
	int quantity;
	float total,rate;
	
	void bill() throws ArithmeticException
	{
		
		
			total=2/0;
		
			System.out.println("chech again");
	}
}






public class TryCatchSimple {
public static void main(String f[])
{
	try {
	Prodect k=new Prodect();
	k.bill();
	}catch(Exception exc)
	{
	System.out.println("0 present");	
	}
}
	
	

}
