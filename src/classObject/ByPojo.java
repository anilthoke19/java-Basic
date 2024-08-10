package classObject;

import java.util.Scanner;

class Bottle
{
	int id,price;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	Bottle obj[];
	void showData(Bottle objk[])
	{
		obj=objk;
	}
	
	void display() {
	for(int i=0;i<obj.length;i++)
	{
		System.out.println(obj[i].getName()+" "+obj[i].getId()+" "+obj[i].getPrice());
	}
  //System.out.println(obj.length);
	}
	
	void highPrice()
	{
		int max=0;
		Bottle high=obj[0]; 
		for(int i=0;i<obj.length;i++)
		{
			if(obj[i].getPrice()>high.getPrice())
			{
				high=obj[i];
				//max=i;
			}
		}
		System.out.println("highest"+high.getName()+high.getId()+" "+high.getPrice());
	}

	
}


public class ByPojo {
	public static void main(String[] args) {
		int id,price;
		String name;
		Bottle b[]=new Bottle[4];
		Bottle p=new Bottle();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<b.length;i++) {
			System.out.println("enter name, the id,price");
			name=sc.nextLine();
			id=sc.nextInt();
			price=sc.nextInt();
			sc.nextLine();
			b[i]=new Bottle();
			b[i].setName(name);
			b[i].setId(id);
			b[i].setPrice(price);
			
		}
		p.showData(b);
		p.display();
		p.highPrice();
		
		
	}

}
