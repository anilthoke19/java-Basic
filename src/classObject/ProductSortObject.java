package classObject;

import java.util.Scanner;

class Productt 
{
	int id,quantity,i;
	float price;
	String name;
	
	Productt p[]=new Productt[4];

	void add()
	{
		
		for(i=0;i<p.length;i++)
		{
			Scanner s=new Scanner(System.in);

			System.out.println("enter name ,id ,price and quantity ");
			name=s.nextLine();
            id=s.nextInt();
            price=s.nextFloat();
            quantity=s.nextInt();
           // s.next();
            
           p[i]=new Productt();
           p[i].name=name;
           p[i].id=id;
           p[i].price=price;
           p[i].quantity=quantity;	
		}
	}
	
	void display()
	{
		for(i=0;i<p.length;i++)
		{
			if(p[i].price>50)
			System.out.println(p[i].id+" "+p[i].name+" "+p[i].price+" "+p[i].quantity);
		}
		
		
	}
	
}



public class ProductSortObject {
	public static void main(String[] arg)
	{
		
		Productt k=new Productt();
		k.add();
		k.display();
	}

}
