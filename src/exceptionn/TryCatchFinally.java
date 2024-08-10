package exceptionn;


public class TryCatchFinally {
	public static void main(String[] args) {
		
		try {
			bedmethod();
			System.out.println("A");
		}catch( Exception ex)
		{
			System.out.println("B");
		}finally
		{
			System.out.println("C");
		}
		System.out.println("D");
		
		
	}
	
	public static void bedmethod()
	{
		throw new Error();
	}

}
