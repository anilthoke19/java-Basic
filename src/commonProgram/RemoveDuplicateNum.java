package commonProgram;


class Remove
{
	int no[];
	
	void add(int no[])
	{
		this.no=no;
	}
	
	
	void display()
	{
		// sorting array  
	int i,j,k;
	for(i=0;i<no.length;i++)
	{
		for(j=i;j<no.length;j++)
		{
			if(no[i]>no[j])
			{
				int temp=no[i];
				no[i]=no[j];
				no[j]=temp;
			
			}
		}
	}
	
	
	
	
	int count=0;
	int len=no.length-1;
	for(i=0;i<len;i++)
	{
		
			if(no[i]==no[i+1])
			{
				for(j=i;j<no.length-1;j++)
				{
				no[j]=no[j+1];
				
				}
				//System.out.println(no[i]); //for show duplicate number 
			len--;
				
			i--;
			}
			
	}

	
	
	
	//no[no.length]=no[no.length];
	for(j=0;j<=len;j++)
	{
		System.out.println(no[j]);
	}
	
	
	}
	

	
}


public class RemoveDuplicateNum {
public static void main(String[] v)
{
	int a[]=new int[]{1,2,3,1,4,5,6,6,7};
Remove r=new Remove();
r.add(a);
r.display();

}
}
