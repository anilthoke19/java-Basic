package wrapperClassP;

class Compare
{
	void show()
	{
		String a="anil";
		String b=new String("anil");
		String c="anil";
		String d=new String("anil");
		
		if(b==d) {
			System.out.println("b and d is equal");
		}
		
		else if(a==b)
		{
			System.out.println("a and b is equal");
		}else if(a==c)
		{
			System.out.println("a and c is equal");
		}else if(b==c) {
			System.out.println("b and c is equal");
		}
		else
			System.out.println("a and b not equal");
	}
	
	
}


public class StringCompare
{

	public static void main(String[] ag)
	{
	
		Compare e=new Compare();
		e.show();
	}
}
