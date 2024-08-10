package objectClassMethod;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class Product1 implements Comparable
{
	int id,price;
	String name;
	
	Product1(int id,int price,String name)  
	{
	this.id=id;
	this.price=price;
	this.name=name;
	}
	

	public int compareTo(Object obj) {
	Product1 p=(Product1)obj;
	
	if(this.id>p.id)
	{
		return 1;
	}
	else if(this.id<p.id) 
	{
		return -1;
	}
	else 
		return 0;
	}
	
	
}




public class ComparableSort {
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		Product1 p=new Product1(8, 50,"pen");
		Product1 p2=new Product1(2, 100,"book");
		Product1 p3=new Product1(3, 300,"bottle");
		Product1 p4=new Product1(444, 400,"notebook");
		Product1 p5=new Product1(5, 500,"cover");
		
		a.add(p);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		a.add(p5);
		
		Collections.sort(a);
		
		for(Object obj:a)
		{
			Product1 p8=(Product1)obj;
			System.out.println(p8.id+" "+p8.name+" "+p8.price);
		}
		


		
		
		
	}

}
