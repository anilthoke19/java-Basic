package stringProram;

import java.util.Scanner;

public class HighestCountChar {
	static char high;
	public static void main(String[] args) {

		String name;
		int i,j,count=0,max=0,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String ");
		name=sc.nextLine();
		
		int size=name.length();
		char value[]=new char[size];

		
		for(i=0;i<size;i++)
		{
			value[i]=name.charAt(i);
			if(value[i]>='A'&&value[i]<='Z')
			{
				value[i]=(char)(value[i]+32);
			}
			
		}
		
		for(i=0;i<size;i++)
		{
			count=1;
			//flag=0;
			for(j=i+1;j<size;j++)
			{
				
				if(value[i]==value[j])
				{
					count++;
				}
				}
			
			if(count>max)
			{
				
				flag=1;
				max=count;
				 high=value[i];
			}
			else // if max value high then flag =0 and execute else flag 
			{
				flag=0;
			}
		}
		
		if(flag==0)
		{
			
			System.out.println("count is: "+max+"  char is: "+high);

		}
		
		
		
		
	
		for( i=0;i<size;i++)
		{
			System.out.println(value[i]);
		}
		
		
	}

}
