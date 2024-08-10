package iinheritance;

import java.util.Scanner;

class ArrayParent{
	int arr[];
	protected void setValue(int arr[])
	{
		this.arr=arr;
	}
	
	protected void arrangeSeq()
	{
		System.out.println("Origional array is ");
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	
	}
}

class ArrangeAscending extends ArrayParent{
	
	protected void arrangeSeq() 
	{
		super.arrangeSeq();

		// display in descending order
		int i,j,temp;
		for(i=0;i<arr.length;i++)
		{
			for(j=i;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("\n\nDescending order array is");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n");
	}

}

class ReverseArray extends ArrayParent
{
	protected void arrangSeq() {
		//this.arrangeSeq();
		//reverse array
		int i,j,temp,mid,len;
		mid=arr.length/2;
		len=arr.length-1;
		
		for(i=0;i<mid;i++)
		{
			temp=arr[i];
			arr[i]=arr[len];
			arr[len]=temp;
			len--;
			
		}
		
		System.out.println("Reverse array is");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	
}


public class ArrayParent5 {
	public static void main(String [] arg)
	{
		int i;
		Scanner s=new Scanner(System.in);
		int a[]=new int[9];
		System.out.println("enter the 9 element in array");
		
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		
		ArrangeAscending g=new ArrangeAscending();
		g.setValue(a);
		g.arrangeSeq();
		
		
		ReverseArray y=new ReverseArray();
		y.setValue(a);
		y.arrangSeq();
	}

}
