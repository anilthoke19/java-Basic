package collectionJava;
import java.util.*;
class Movie
{
	ArrayList ar=new ArrayList();
	Movie m[];
	int id,price;

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
	
	public Movie(int id,int price)
	{
		this.id=id;
		this.price=price;
	}
	
	public Movie()
	{
		
	}
	
	
	void add(Movie m[])
	{
		this.m=m;
	}
	
	void display()
	{
		ar.add(m);
  
	}
	
	void show() {	
		for(Object obj:ar)
		{
			Movie m=(Movie)obj;
			System.out.println(m.getId()+" "+m.getPrice());
		}
	}
	
	
}

public class RemoveRecord {
	public static void main(String[] args) {
		Movie n=new Movie(); 

		Movie m[]=new Movie[4]; 
		
		m[0]=new Movie();
		m[0].setId(1);
		m[0].setPrice(11);;
		n.add(m);
		n.display();

		
		m[1]=new Movie();
		m[1].id=2;
		m[1].price=22;
		n.add(m);
		n.display();

		
		m[2]=new Movie();
		m[2].id=3;
		m[2].price=33;
		n.add(m);
		n.display();

		
		m[3]=new Movie();
		m[3].id=4;
		m[3].price=44;
		n.add(m);
		n.display();

		
		
		n.show();
		
		
	}

}
