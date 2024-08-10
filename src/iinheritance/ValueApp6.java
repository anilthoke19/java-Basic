package iinheritance;

import java.util.Scanner;

 abstract  class Valueses
  {
	int number,index;
	
	void setValue(int number,int index)
	{
		this.number=number;
		this.index=index;
	}
	
	abstract int getResult();
}


class Power extends Valueses
{
	int getResult()
	{
		int i,pow=1;
		for(i=1;i<=index;i++)
		{
			pow=number*pow;
			
		}
		return pow;
	}
	
}

class SearchDigit extends Valueses
{
	int getResult()
	{
		int temp=number,flag=0;
		while(temp!=0)
		{
		int rem=temp%10;
		
		if(rem==index)
		{
			flag=1;
			break;
		}
		temp=temp/10;
		
		}
		if(flag==1)
			return index;
		else
			return -1;
	}
	
}
 

public class ValueApp6 {
	public static void main(String[] g)
	{
	
		Scanner s=new Scanner(System.in);
		int number ,index;
		System.out.println("enter the number and index");
		number=s.nextInt();
		index=s.nextInt();
		
		Power p=new Power();
		p.setValue(number, index);
		int result=p.getResult();
		System.out.println("power is "+result);
		
		SearchDigit d=new SearchDigit();
		d.setValue(number, index);
		result=d.getResult();
		System.out.println(result);
	}

}
