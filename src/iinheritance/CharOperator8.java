package iinheritance;

import java.util.Scanner;

interface CharOperator{
	void setCharArr(char[] Name);
	char []getResult();
	
}

class ConvertUpper implements CharOperator{
	char name[];
	public void setCharArr(char[] name)
	{
	this.name=name;	
		
	}
	
	public char[] getResult()
	{
	for(int i=0;i<name.length;i++)
	{
		if(name[i]>='a'&&name[i]<='z')
		{
			name[i]=(char)(name[i]-32);
		}
	}
	return name;
	
	}
	
}

class ChangeAlternateChar implements CharOperator
{
	char name[];

	
	public void setCharArr(char[] name) {
		this.name=name;
	}

	
	public char[] getResult() {
		
		for(int i=0;i<name.length;i++)
		{
			if(i%2==0) {
			
				if(name[i]>='a'&& name[i]<='z') {
				name[i]=(char)(name[i]-32);
				}
				
			}
			
			else if(i%2!=0)
			{
				if(name[i]>='A'&&name[i]<='Z')
				{
					name[i]=(char)(name[i]+32);
				}
			}
		}
		//System.out.println(name);
		
		return name;
	}





	
	
}




public class CharOperator8 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter String ");
		String name2=sc.nextLine();
		char name3[]=new char[name2.length()];
		
		for(int i=0;i<name2.length();i++)
		{
			name3[i]=name2.charAt(i);
		}
		System.out.println(name3);
		
		
		ConvertUpper c=new ConvertUpper();
		char name[];//=new char[] {'A','b','C','D','e'};
		c.setCharArr(name3);
		name=c.getResult();
		System.out.println(name);
		ChangeAlternateChar ca=new ChangeAlternateChar();
		ca.setCharArr(name3);
		name=ca.getResult();
		System.out.println(name);
		
	}

}
