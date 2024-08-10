package wrapperClassP;

import java.util.Scanner;

class AddNum
{
	Scanner sc=new Scanner(System.in);
	void addition()
	{
		String name;
		int sum=0;
		System.out.println("enter the String");
//		name=sc.nextLine();
//		
//		char ch[]=new char[name.length()];
		
		char name2[]=new char[10];
		for(int i=0;i<name2.length;i++)
		{
			name2[i]=sc.next().charAt(0);
		}
		for(int i=0;i<name2.length;i++)
		{
			if(name2[i]>=48&&name2[i]<=57)
			{
			sum=sum+(name2[i])-'0';	
			}
			
		}
		System.out.println(sum);
		
	}
}



public class AddNumberInString {

	public static void main(String[] ag)
	{
		AddNum m=new AddNum();
		m.addition();
		
	}
}
