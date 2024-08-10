package classInheritance;

class Pelind
{
	int a[];
	void add(int a[])
	{
		this.a=a;
	}
	
	void dsiplay()
	{
		int i,j, len,mid,temp;
		
		for(i=0;i<a.length;i++)
		{
			for(j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
	
				//Sorting 
		for(int f:a)
		{
			System.out.println(f);
		}
		}
		
}



public class ArrayPelindrome {
	public static void main(String [] h)
	{
	Pelind p=new Pelind();
	int a[]=new int[] {1,2,3,3,2,1,4,6};//1 1 2 2 3 3 4 6 
	p.add(a);
	p.dsiplay();
		
	}

}
