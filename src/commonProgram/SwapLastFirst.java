package commonProgram;

class Swap
{
	int no,count,p=1,first,last,mid;
	void add(int no)
	{
		this.no=no;
	}
	
	void display()
	{
		
		int temp,i;
		temp=no;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=no;
		for(i=1;i<count;i++)
		{
			p=p*10;
		}
		
		last=temp%10;
		
		first=temp/p;
		no=no%p;
		System.out.println(no);
		no=no/10;
		System.out.println(no);
		no=last*p+no*10+first;
		System.out.println(no);
		
		
	}
}



public class SwapLastFirst {
public static void main(String[] d)
{
	Swap s=new Swap();
	s.add(1234678);
	s.display();
}

}
