package commonProgram;

import java.util.Scanner;

public class StringPelindrome {
	String value;
	
	void add(String value)
	{
		this.value=value;
	}
	
	
	void show()
	{
		char temp[]=new char[value.length()];
		char ar[]=new char[value.length()];
	
	for(int i=0;i<value.length();i++)
	{
		ar[i]=value.charAt(i);
		temp[i]=value.charAt(i);
	}
	String bb=new  String(ar);
	
	int count=ar.length-1;
	for(int i=0;i<ar.length/2;i++)
	{
		char t=ar[i];
		ar[i]=ar[count];
		ar[count]=t;
		count--;
	}
	String aa=new String(ar);
	
	if(aa.equalsIgnoreCase(bb))
	{
		System.out.println("pelindrome");
	}else
		System.out.println("not pelindrome");
	
	}

	
	
	public static void main(String[] args) {
		StringPelindrome p=new StringPelindrome();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String valuee=sc.nextLine();
	p.add(valuee);
	p.show();
	
	
	
		
		
	}

}
