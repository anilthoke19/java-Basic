package commonProgram;

import java.util.Scanner;

class Arms{
	int no;
	
	void add(int no)
	{
		this.no=no;
	}
	 
	void display()
	{
		int temp,rem,sum,j,i,count,mult;
		
		
		for(i=1;i<=no;i++)
		{
			temp=i;
			count=0;
			
			while(temp!=0)
			{
				count++;
				temp=temp/10;
				
			}
			temp=i;
			sum=0;
			while(temp!=0)
			{
				mult=1;
				 rem=temp%10;
				for(j=1;j<=count;j++)
				{
					mult=mult*rem;
				}
				
				sum=sum+mult;
				temp=temp/10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
			
			
		}
		
	}
	
}




public class ArmstrongSeries {
	public static void main(String[] g)
	{
		
		Arms a=new Arms();
		Scanner s=new Scanner(System.in);
		int no;
		System.out.println("enter the number");
		no=s.nextInt();
		
		a.add(no);
		a.display();
		
	}

}
