package iinheritance;

import java.util.Scanner;

class Arr
{
	int a[];
	void setValue(int...a)
	{
		this.a=a;
	}
	
	int getArrSum()
	{int sum=0,i;
	for(i=0;i<a.length;i++)
	{
		sum=sum+a[i];
	}
		
	
		return sum;
	}
}



public class ArrSumApp {
	public static void main(String []j)
	{int size,i,sum;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of array");
		size=s.nextInt();
		
		int a[]=new int [size];
		
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		Arr r=new Arr();
		r.setValue(a);
		sum=r.getArrSum();
		System.out.println("Sum of the array is  "+sum);
		
	}

}
