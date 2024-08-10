package interview;

import java.util.Scanner;

public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter String ");
		String name=sc.nextLine();
		String v=" ";
	    String name1[]=name.split(" ");
		
		for(int i=0;i<name1.length-1;i++)
		{
			if(name1[i].equals(name1[i+1]) )
			{
				
				for(int j=name1.length-1;j>=i+1;j--)
				{
					name1[j]=name1[j+1];
					
				}
			}
			
		}
		
		for(int i=0;i<name1.length;i++)
		{
			System.out.println(name1[i]);
		}
	}

}
