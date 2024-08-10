package mapProgram;
import java.util.*;

class Book1
{
	int id,price;
	String name;
	
	public Book1(int id,int price,String name)
	{
		this.id=id;
		this.price=price;
		this.name=name;
	}
	
	public Book1()
	{
		
	}

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



public class EntrySet {
	
	public static void main(String[] args) {
		
		
		Book1 k=new Book1(1,2,"Java");
		Book1 k2=new Book1(22,3,"Css");
		Book1 k3=new Book1(4,5,"html");
		
		LinkedHashMap p=new LinkedHashMap();
		LinkedHashMap p2=new LinkedHashMap();
		LinkedHashMap p3=new LinkedHashMap();

		
		p.put("aus", k);
		p2.put("india", k2);
		
		p3.put("first", p);
		p3.put("second", p2);
		
		
		Set keys=p3.keySet();
		
		Iterator i=keys.iterator();
		
		while(i.hasNext())
		{
			Object key=i.next();
			Object value=p3.get(key);
			
			LinkedHashMap p4=(LinkedHashMap)value;
			
			Set keyInner=p4.keySet();
			
			Iterator ii=keyInner.iterator();
			
			System.out.println("dept name"+keyInner);
			while(ii.hasNext())
			{
				Object innerKey=ii.next();
				Object innerValue=p4.get(innerKey);
				
				System.out.println(innerKey+" combine"+innerValue);
				
			}
			
		}
	
	}

}
