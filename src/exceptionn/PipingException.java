package exceptionn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PipingException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int d;
	int no=20;
	try {
	if(no%2==0)
	{
		System.out.println("enter the charcter");
		d=sc.nextInt();
		try {
			if(no%0==0) {
				System.out.println("nodifi");
			}
			
		}
		catch(ArithmeticException exp) {
			System.out.println(exp);
		}
		
	}
	}catch(InputMismatchException |NumberFormatException ex)
	{
		System.out.println(ex);
	}
	
}
}
