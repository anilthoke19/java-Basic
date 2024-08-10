package classObject;

public class Object1with2Refrence {
	
		int a,b;
	
		public void setValue(int a,int b)
		{
			this.a=a;
			this.b=b;
			
		}
		
		void addition()
		{
			int c;
			c=a+b;
			System.out.println(c);
			
		}
	
	
	
	
	public static void main(String[] af)
	{
		Object1with2Refrence e=new Object1with2Refrence();
		e.setValue(2, 4);
		e.addition();
		Object1with2Refrence d=e;
		d.addition();
		
	}
	

}
