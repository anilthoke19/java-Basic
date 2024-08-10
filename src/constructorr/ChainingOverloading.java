package constructorr;

class Mobile
{
	protected int no,price,ram;
	String name;
	float processor;
	
	Mobile(int no,int price)
	{
		
		System.out.println("i am third functio"+no+price);
//		this.no=no;
//		this.price=price;
	}
	Mobile(int no,int price,int ram)
	{
		this(5000,5.5f);   
//		this.no=no;
//		this.price=price;
//		this.ram=ram;
		System.out.println("I am calling function"+no+price+ram);
	}
	
	Mobile(int no,float processor)
	{
		this(100,200);
//		this.no=no;
//		this.processor=processor;
		System.out.println("secnd function"+no+processor);
	}
	
	
	
}




public class ChainingOverloading {
	public static void main(String[] arg)
	{
		
		Mobile m=new Mobile(1,2,3);
	}

}
