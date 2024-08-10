package commonProgram;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	char a[],b[];
	
	void add(char a[],char b[])
	{
		this.a=a;
		this.b=b;
		
	}
	
	void compare()
	{
		
//		// block for sorting purpose
		{
//			
//			for(int i=0;i<a.length;i++)
//			{
//				for(int j=i+1;j<a.length;j++)
//				{
//					if(a[i]>a[j])
//					{
//						char temp=a[i];
//						a[i]=a[j];
//						a[j]=temp;
//					}
//
//				}
//			}
//			for(int i=0;i<b.length;i++)
//			{
//				for(int j=i+1;j<b.length;j++)
//				{
//					if(b[i]>b[j])
//					{
//						char temp=b[i];
//						b[i]=b[j];
//						b[j]=temp;
//					}
//
//				}
//			}
		}
		// sort by Built-in function
		Arrays.sort(a);
		Arrays.sort(b);
		
	System.out.println(a);
	System.out.println(b);
		int flag=0;
		if(a.length!=b.length)
		{
			System.out.println("String is not anagram ");
		}
		else
		{
			
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==b[i])
				{
					flag=1;
				}else
				{
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("string is anagram");
		}else
			System.out.println("String is not angram");
	}
	
	public static void main(String[] args) {
		String f,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first and second string");
		f=sc.nextLine();
		s=sc.nextLine();
		
		
		
		char a[]=new char[f.length()];
		char b[]=new char[s.length()];
		
		for(int i=0;i<a.length;i++) // first String to char with lower case 
		{
			if(f.charAt(i)>=97&&f.charAt(i)<=127)
			{
				a[i]=(char) (f.charAt(i)-32);
			}else { 
				a[i]=f.charAt(i);
			}
			
			if(s.charAt(i)>=97&&s.charAt(i)<=127)
			{
				b[i]=(char) (s.charAt(i)-32);
			}else { 
				b[i]=s.charAt(i);
			}
			
			
		}
 
		AnagramString m=new AnagramString();
		m.add(a, b);
		m.compare();
		
	}

}
