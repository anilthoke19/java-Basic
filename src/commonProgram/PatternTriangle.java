package commonProgram;

import java.util.Arrays;
import java.util.Collections;

public class PatternTriangle {
	public static void main(String[] args) {
		
	//	Fibonic series
//		int temp=0,a=0,b=1,sum;
//	for(int i=1;i<11;i++)
//	{
//		
//		 sum=a+b;
//		 a=b;
//		 b=sum;
//		
//		System.out.println(sum);
//	}
//	
		
	
		//occurences in array
//		
//		int a[] =new int[] {2,33,4,94,5,2,3,7,6,7,9,94,5};
//		
//		
//		// Arrays.sort(a);
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//							
//				}
//			}
//		}
//		
//		 
//		 int count=1,i;
//		 for( i=0;i<a.length-1;i++)
//		 {
//			 
//			 if(a[i]==a[i+1])
//				 {
//					 count++;
//				 }
//				 else 
//				 {
//					 System.out.println(a[i]+" "+count);
//					 count=1;
//				 }
//		 }
//		 
//		System.out.println(a[i]+" "+count);
//		
		
		
		
		
		
		
//		for(int i=1;i<6;i++)
//		{
//			int num=1,flag=1;
//			for(int j=1;j<10;j++)
//			{
//				flag=0;
//				if( (j>=6-i)&&(j<=4+i))
//				{	
//			      if(j>4)
//				{
//					System.out.print((num--));
//
//				}else
//				{
//				System.out.print(num++);
//				}
//				}
//					else {
//					System.out.print(" ");
//					flag=1;
//				}
//				
//			}
//			System.out.println();
//		}
//		

		
		
//      Remove duplicate from Array
		
		int a[] =new int[] {2,33,4,94,5,2,3,7,6,7,9,94,5};
         int index=a.length-1;
         int count=1;
		Arrays.sort(a);
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{index--;
			  
				for(int k=i;k<a.length-1;k++)
				{
					 a[k]=a[k+1];
					
				}
				
			}
			
		}
	
		
		for(int i=0;i<=count;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		
		
	}
	
	}
