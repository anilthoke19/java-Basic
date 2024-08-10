package objectClassMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ProductClass {
	int id,price;
	String name;
	
	
	ProductClass(int id,int price,String name)
	{
		this.id=id;
		this.price=price;
		this.name=name;
	}
	
	// Or Getter -Setter Method
	
	
}
	class SortById implements Comparator
	{
		
		public int compare(Object obj,Object obj2)
		{
			ProductClass p=(ProductClass)obj;
			ProductClass p2=(ProductClass)obj2;
			
			if(p.id>p2.id)
			{
				return 1;
			}
			else if(p.id<p2.id)
			{
				return -1;
			}
			else
				return 0;
 
		}
		
	}
	
	class SortByPrice implements Comparator
	{
		
		public int compare(Object obj,Object obj2)
		{
			ProductClass pp=(ProductClass)obj;
			ProductClass p3=(ProductClass)obj2;
			
			if(pp.price>p3.price)
			{
				return 1;
				
			}
			else if(pp.price<p3.price)
			{
				return -1;
			}
			else {
			return 0;}
		}
	}
	

public class ComparatorSort {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		ProductClass p=new ProductClass(1,2,"pen");
		ProductClass p2=new ProductClass(3,33,"book");
		ProductClass p3=new ProductClass(44,444,"book");
		ProductClass p4=new ProductClass(9,1,"book");
		ProductClass p5=new ProductClass(99,3,"book");
		a.add(p);
		a.add(p2);
		a.add(p3);
		a.add(p4);
		a.add(p5);

		SortByPrice e=new SortByPrice();
		Collections.sort(a,e);
		
		System.out.println("Sort By Price");
		for(Object ob:a)
		{
			ProductClass pp=(ProductClass)ob;
			System.out.println(pp.price);
			
		}
		
		
		SortById d=new SortById();
		Collections.sort(a,d);

		
		System.out.println("Sort By ID");
		for(Object ob:a)
		{
			ProductClass pp=(ProductClass)ob;
			System.out.println(pp.id);
			
		}
		
		
		
		
		
		
	}

}
