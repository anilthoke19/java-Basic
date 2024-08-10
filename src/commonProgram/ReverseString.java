package commonProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String ");
		String name=sc.nextLine();
	 String  value[]=name.split(" ");
	 System.out.println(value.length);
		int index=value.length-1;
		for(int i=0;i<value.length/2;i++)
		{
			
			String temp=value[i];
			value[i]=value[index];
			value[index]=temp;
			index--;
			
			
			
			
		}
		for(int i=0;i<value.length;i++)
		{
			System.out.println(value[i]);
		}
		
		
		
		
	}
	
}
