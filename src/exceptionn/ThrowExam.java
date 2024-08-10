package exceptionn;

class AgeException  extends ArithmeticException
{
	
	public String AgeE()
	{
		return "Age is not correct";
	}
}

class Voter
{
	int a=20;
	
	void Dem() 
	{
	if(a<50)
	{
	throw new AgeException();
	}
	else 
		System.out.println("valid voter ");
	
	}
	
}

public class ThrowExam {
	public static void main(String[] args) {
		try {
		Voter v=new Voter();
		v.Dem();
		}catch(AgeException x)
		{
			System.out.println(x.AgeE());
		}
	}
	

}
