package commonProgram;

import java.util.Scanner;

class Sort{
	
	
	int a[];
	void add(int a[])
	{
		this.a=a;
		 
	}
	
	void sort() {
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		/*
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}*/
	}
	
	int removeDupl()
	{ int count=0,j=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
			
			}
		}
		a[j++]=a[a.length-1];
		/*
		for(int i=0;i<j;i++) {
			System.out.println(a[i]);
			}
			*/
		
		return j;
	}
}
	
	public class SortDuplicate {
		
	public static void main(String[] args) {
		Sort t=new Sort();
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("enter array elemrnt");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		t.add(a);
		t.sort();
		int j=t.removeDupl();
		for(int i=0;i<j;i++)
		{
			System.out.println(a[i]);

		}
		
	}

}
