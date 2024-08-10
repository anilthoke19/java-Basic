package classObject;
import java.util.*;
class Product
{
	int quantity,id;
	String name;
	float price;
	
	void set(int id,String name,float price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void display()
	{
		
		System.out.println(id+" "+name+" "+price);
	}
}




public class ProducttApp {
	public static void main(String[]sd)
	{
		int i,id,price;
		String name;
		Product p[]=new Product[3];
		for(i=0;i<p.length;i++)
		{
			System.out.println("enter name,id and price");
			Scanner s=new Scanner(System.in);
			name=s.nextLine();
			id=s.nextInt();
			price=s.nextInt();
			
			
			
			p[i]=new Product();
			p[i].set(id, name, price);
			p[i].display();
		}
		
		
		
	}

}
