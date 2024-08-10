package commonProgram;

import featuresJava1_8.*;

//@FunctionalInterface
interface Area
{
	 int[] value(int a);
	
	
	
	
}



public class PrimeNumByLambada {
	public static void main(String[] args) {
 Area aa=(int a)->{
	int d[]=new int[a];
	int count=0,flag=0;
	 for(int i=1;i<=a;i++)
	 {
		 flag=0;
		for(int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				flag=1;
				break;
				
			}
		}
		if(flag==0)
		{
			d[count]=i;
			count++;
		}
		 
	 }
	 return d;
	 
 };

	int k[]=aa.value(200);
	for(int i=0;i<k.length;i++)
	{
		System.out.println(k[i]);
	}

	}
}

//(((Addition)(int aa, int bb)->System.out.println(aa+bb))).sum(10,20);	
