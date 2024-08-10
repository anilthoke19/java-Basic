package exceptionn;

import java.util.Scanner;


class User extends ArithmeticException
{
	
	
	
	public static String Exce()
	{
		return "It is User defined Exception";
	}
}

public class CheckException extends ClassLoader{
	

	public void add()
	{
		if(2>1)
		{
			throw new User(); 
		}
	}
	
	public static void main(String[] args) {
		
	//Scanner sc=new Scanner(System.in);	
		//int a=20;   //Arithmatic exception
		//System.out.println(a/0);	
	
	
	//String name="anil";   //Number format exception
	//int b=Integer.parseInt(name);
	//System.out.println(b);

	
//	int aa[]=null;      // Null pointer Exception
//	System.out.println(aa[0]);
		
		
//int aa[]=new int[2];    // Array out of Bound exception
//System.out.println(aa[7]);
		
		
//		int a;           //Input mismatch exception
//		a=sc.nextInt();
//		System.out.println(a);
	
	CheckException c=new CheckException();
	
	try {
		c.add();
	}catch(User e)
	{
		System.out.println(e.Exce());
	}
	
		
		
		
	}
}
