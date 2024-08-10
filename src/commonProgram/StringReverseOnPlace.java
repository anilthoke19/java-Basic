package commonProgram;

import java.util.Scanner;

public class StringReverseOnPlace {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String value[]=name.split(" ");
		char n[]=new char[name.length()];
		System.out.println(name.length()+"length of String");
		int i=0,count=0;
//		for(int i=0;i<value.length;i++)
		//{
		int lindex=value[i].length()-1;
	
			for(int j=0;j<value[i].length()/2;j++) {
				
				char first=value[i].charAt(j);
				char last=value[i].charAt(lindex);
				char temp=first;
				first=value[i].charAt(lindex);
				last=temp;
				
			      --lindex;
			      
						System.out.println(first+" "+last);
					
						n[count++]=first;
						n[count]=temp;
						
						
						
			if(value[i]==" ")
			{
				break;
			}
			}
		//}
	
		
		System.out.println(value[0]);
		System.out.println(n);
	}
}
