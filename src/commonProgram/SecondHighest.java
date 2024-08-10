package commonProgram;

class Second
{
	int no[],high,shigh;
	
	void add(int no[])
	{
		this.no=no;
	}
	
	

	void show()
	{int i;
		high=no[0];
		int len=no.length;
		for(i=0;i<len;i++)
		{
			if(high<no[i])
			{
				high=no[i];
			}
		}
		System.out.println(high);
		shigh=no[0];
		for(i=0;i<len;i++)
		{
			if(shigh>no[i]&&no[i]<high)
			{
				shigh=no[i];
			}
		}
		System.out.println(shigh);
	}
}


public class SecondHighest {
	public static void main(String[] a)
	{
		Second s=new Second();
		int no[]=new int[]{2,5,3,2,6};
	System.out.println(no.length+"len");
		s.add(no);
		s.show();
		
	}

}
