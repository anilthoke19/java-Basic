package collectionJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Shop
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
	
	
}

class ShopOpe{
   ArrayList a=new ArrayList();
	
	int id,price;
	String name;
	Scanner sc=new Scanner(System.in);
 void add()
{
	 Shop p[]=new Shop[3];
	 for(int i=0;i<p.length;i++) {
	System.out.println("enter name ,id,price");
	name=sc.next();
	id=sc.nextInt();
	price=sc.nextInt();
	p[i]=new Shop();
	p[i].setName(name);
	p[i].setId(id);
	p[i].setPrice(price);
	 a.add(p[i]);
	 }
	
	
}

void show()
{
	
	for(Object obj:a)
	{
		Shop pp=(Shop)obj;
		System.out.println(pp.getName()+" "+pp.getId()+" "+pp.getPrice());
	}	
}
void RemoveByName()
{int index;
	System.out.println("enter a name for delete object");
	String nname=sc.next();
	
	for(Object obj:a)
	{
		Shop pp=(Shop)obj;
		if(pp.getName().equalsIgnoreCase(nname))
		{
			 index= a.indexOf(pp);
            a.remove(index);
			break;
		}
		
	}
	System.out.println("after value delete list");
	for(Object obj:a)
	{
		Shop pp=(Shop)obj;
		System.out.println(pp.getName()+" "+pp.getId()+" "+pp.getPrice());
	}

}

void CheckItem()
{
	int flag=0;
	System.out.println("\nenter a name for search");
	name=sc.next();
for(Object obj:a)
{
	Shop p=(Shop)obj;
	
    if( p.getName().equalsIgnoreCase(name))
    {
    	System.out.println(p.getName()+" "+p.getId()+" "+p.getPrice());
    	flag=1;
    	break;
    }
}
	if(flag==1)
		System.out.println("item found");
	else
		System.out.println("Item not found");
}

void update ()
{
	System.out.println("\nenter name for update");
	name=sc.next();
	
	for(Object obj:a)
	{
		Shop p=(Shop)obj;
		
		if(p.getName().equalsIgnoreCase(name))
		{
			System.out.println("\nenter name .id and price for updating ");
			name=sc.next();
			id=sc.nextInt();
			price=sc.nextInt();
			p.setName(name);
			p.setId(id);
			p.setPrice(price);
		}
	}
}

}

public class ShopSorting {
public static void main(String[] args) {
	
	ShopOpe p=new ShopOpe();
	p.add();
	p.show();
	p.RemoveByName();
	p.CheckItem();;
	p.update();
	p.show();

	
}
	
	
}
