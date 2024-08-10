package objectClassMethod;

class Mobile
{
	int id,price;
	String name;
	
	Mobile(int id,int price,String name)
	{
		this.id=id;
		this.price=price;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+price+" "+name);
	}
	
	
	public String toString()
	{
		return "[id: "+id+ "\tprice: " +price+ "\tname: "+name;
	}
}





public class ToStringMethod {
	public static void main(String[] args) {
		
		
		Mobile m=new Mobile(1,2,"hp");
		Mobile m2=new Mobile(2,3222,"lenovo");
		Mobile m3=new Mobile(3,44444,"nokia");
		
		System.out.println(m.toString());
		
		
		


		
		
	}

}
