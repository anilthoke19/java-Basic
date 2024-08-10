package interview;

import java.util.Scanner;

public class ArmstrongNUmber {
	public static void main(String[] args) {
		
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int no=sc.nextInt();
		int temp=no;

		while(no!=0)
		{
			
			int rem=no%10;
			sum=(rem*rem*rem)+sum;
			
			no=no/10;
		}
		no=temp;
		
		if(no==sum) {
			System.out.println("Number is armstrong ");
		}else 
		{
			System.out.println("Number is not armstrong");
		}
		
		
	}

}
