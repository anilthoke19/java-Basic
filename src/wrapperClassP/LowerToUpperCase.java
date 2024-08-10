package wrapperClassP;

import java.util.Scanner;

public class LowerToUpperCase {
char name[];
	void Add(char name[])
	{
	this.name=name;
	
	}
	
	void LowerToUp()
	{
		
		for(int i=0;i<name.length;i++)
		{
			if(name[i]>='a'&&name[i]<='z')
			{
				name[i]=(char)(name[i]-32);
			}
		}
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char []n=new char[10];
		System.out.println("enter the charcter string");
		for(int i=0;i<n.length;i++) {
		n[i]=sc.next().charAt(0);
		}
//		System.out.println(n);
		
	LowerToUpperCase l=new LowerToUpperCase();
	l.Add(n);
	l.LowerToUp();
	}
}
