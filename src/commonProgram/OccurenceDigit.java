package commonProgram;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OccurenceDigit {
	int ar[],i,j,k,count;
	void setValue(int ar[])
	{
		this.ar=ar;
		
	}
	
	void occurence()
	{
	for(i=0;i<ar.length;i++)
	{
		for(j=i+1;j<ar.length;j++)
		{
			if(ar[i]>ar[j])
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		
	}
//	for(i=0;i<ar.length;i++)
//	{
//		System.out.println(ar[i]);
//	}
	
	count=1;
	for(i=0;i<ar.length-1;i++)
	{
		
		if(ar[i]==ar[i+1])
		{
			count++;
		}
		else {
			System.out.println(ar[i]+" "+count);
			count=1;
		}
	}
	System.out.println(ar[i]+" last "+count);
		
		
		
	}
	
	
	public static void main(String[] args) {
		OccurenceDigit c=new OccurenceDigit();
		
		int a[]=new int[] {1,2,3,8,9,7,2,3,8,7,10,9};
//		Scanner sc=new Scanner(System.in);
//		int len=a.length;
//		for(int i=0;i<len;i++)
//		{
//			a[i]=sc.nextInt();
//		}
		
		c.setValue(a);
		c.occurence();
	
	}
}
