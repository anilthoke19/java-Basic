package exceptionn;

class Laptop
{
	
	void Show() throws ArithmeticException,IndexOutOfBoundsException 
	{
		int no=100;
		int sum=no/0;
		System.out.println("Remainder");
		
		
	}
	
	void display()
	{
		String s="12234";
		int a=10;
		Float g=32f;
		 a=g.intValue();
		System.out.println(a);
		//s=(String)a;
		
		System.out.println("method after exceptin block");
	}
	
}

public class ThorwsException {

	public static void main(String[] args)   {
		
		Laptop l=new Laptop();
		try {
		l.Show();
		}catch(ArithmeticException exp)
		{
			System.out.println(exp);
		}catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		l.display();
	}
}
