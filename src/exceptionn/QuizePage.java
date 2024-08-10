package exceptionn;

public class QuizePage {

	public static void main(String[] args) {
		
		
		try {
			int x=0;
			int y=5/x;
		}catch(ArithmeticException ae)
		{
			
		}
		
		catch(Exception e)
		{
			System.out.println("exception");
		}
		
	}
	
}
