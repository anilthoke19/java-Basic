package wrapperClassP;

import java.util.Scanner;

public class ConvertStringIntoArray {
Scanner sc=new Scanner(System.in);
	void add()
	{
		String m;
		System.out.println("enter the  string");
		String a=sc.nextLine();
		//String a="anIl";
		char b[]=new char[a.length()];
		
		for(int i=0;i<a.length();i++)
		{
			b[i]=a.charAt(i);
		}
		System.out.println(b);
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>='a'&&b[i]<='z')
			{
				 b[i]=(char)(b[i]-32);
			}
		}
		System.out.println(b);
	}
	
	public static void main(String[] hbh)
	{
		ConvertStringIntoArray y=new ConvertStringIntoArray();
		y.add();
		
		
	}
}
