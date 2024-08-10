package iinheritance;

import java.util.Scanner;

abstract class ArrAbss
{
	int arr[],arr2[];
	void setValue(int arr[],int arr2[])
	{
		this.arr=arr;
		this.arr2=arr2;
	}
	public abstract int[] getResult();
	
}

class InterSection extends ArrAbss
{
	
	public int[] getResult()
	{
		int count =0;
		int arr3[]=new int [arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<i;i++) {
			if(arr[i]==arr2[j])
			{
				arr3[j]=arr[i];
				count++;
			}
			}
		}
	
		
		return arr3;
	}
	
}

class Union extends ArrAbss
{
	int count=0 ;
	
	
	public int[] getResult() {
		int len=arr.length+arr2.length;
		
		
		int []arr4=new int[len];
		//System.out.println(len);
	for(int i=0;i<arr.length;i++)
	{
		arr4[i]=arr[i];
		count++;
		
	}
	for(int j=0;j<arr2.length;j++)
	{
		arr4[count]=arr2[j];
		count++;
	}
	count=12;
	for(int i=0;i<arr4.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr4[i]==arr4[j])
			{
				arr4[j]=arr4[j+1];
				j--;
				count--;
				System.out.println("value"+count);
			}
		}
		
	}
	
	
	
	
	return arr4;
	}
	
}


  
public class ArrAbs7 {

	public static void main(String[] ars)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [6];
		int b[]=new int [6];
		
		System.out.println("enter first array elemrnt");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter second array elemrnt");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int d[];
	int g[];
//		InterSection n=new InterSection();
//		n.setValue(a, b);
//		
//		
//		d=n.getResult();
//		for(int i=0;i<d.length;i++)
//		{
//		
//			System.out.println(d[i]);
//		}
//		
		Union u =new Union();
		u.setValue(a, b);
		g=u.getResult();
		for(int i=0;i<g.length;i++)
		{
			//System.out.println(g[i]);
		}
	}
}
