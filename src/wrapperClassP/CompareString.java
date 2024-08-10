package wrapperClassP;


class Compared
{
String a,b;
	void add(String a,String b)
	{
		this.a=a;
		this.b=b;
	}
	
	void display()
	{
		int flag=0;

		char c[]=new char[a.length()];
		char d[]=new char[b.length()];
		
		if(a.length()!=b.length())
		{
			System.out.println("String are not equal");
		}
		else
		{
		for(int i=0;i<a.length();i++)
		{
			c[i]=a.charAt(i);
			d[i]=b.charAt(i);
	
		}
		for(int i=0;i<a.length();i++)
		{
			if(c[i]==d[i])
			{
				//System.out.println("String are equal");
			}
			else
			{
				flag=1;
				break;

			}
		}
		
			
		}
		
		if(flag==1)
		{
			System.out.println("String are not equal");

		}
		else
		System.out.println("String are equal");

	}
}

public class CompareString {

	public static void main(String[] ar)
	{
	String a="Anil";
	String b="Anil";
	
	Compared c=new Compared();
	c.add(a, b);
	c.display();
	
	
		
	}
}
