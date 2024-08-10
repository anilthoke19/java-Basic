package collectionJava;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Book7 implements Cloneable
{
	
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
	
		
	public String toString()
	{
		
		
		return id+" "+price;
	}
}




public class EqualMethod {
	public static void main(String[] args) {
		
		
		Book7 b=new Book7();
		b.setId(10);
		b.setPrice(121);
		String  g=b.toString();
		System.out.println(g);
		
		Book7 b2=new Book7();
		b2.setId(100);
		b2.setPrice(1121);
		String  g2=b2.toString();
		System.out.println(g2);
		
		Book7 b3=new Book7();
		b2.setId(100);
		b2.setPrice(1121);
		
	
		
		TreeMap<Integer,Book7> k=new TreeMap();
		
		k.put(1, b2);
		k.put(2, b);
		k.put(3, b3);
		
		Set <Map.Entry<Integer , Book7>> s=k.entrySet(); 
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
