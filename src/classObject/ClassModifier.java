package classObject;

class ClassModifier {

	int d[];
	void add(int ...x)
	{
	d=x;	
	}
	
	int[] display()
	{
		for(int i=0;i<d.length;i++)
		{
		//	System.out.println(d[i]);
		}
		//System.out.println(d.length);
		return d;
	}
	
	public static void main(String[] args) {
		
		int a[]=new int[] {1,2,3,4,5,6,7,8};
		ClassModifier m=new ClassModifier();
		m.add(a);
		int c[]=m.display();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}
}
