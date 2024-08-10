package commonProgram;

import java.util.Scanner;

class Primp
{
	int no;
	void add(int no)
	{
		this.no=no;
	}
	
	void  getDisplay()
	{
	int i,j,flag;
	
	for(i=1;i<=no;i++)
	{
		flag=0;
		for(j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(i);
		}
	}
		
	}
	
}



public class PrimeNumber {
	public static void main(String[] f)
	{
	
	Scanner s=new Scanner(System.in);
	Primp p=new Primp();
System.out.println("enter the number\n");
	int no=s.nextInt();
	p.add(no);
	p.getDisplay();

}
}
