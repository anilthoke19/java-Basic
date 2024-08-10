package collectionJava;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		
		ArrayList arr=new ArrayList();
		arr.add(10);
		arr.add(20);       // Add method
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		Object obj= arr;
		System.out.println(obj);
		
		
		
		
		//Replace value in List
		
		arr.set(2, 300);
		System.out.println(obj);
		
		//Remove data in List by Index
		
		arr.remove(2);
		System.out.println(obj);
		
		
		//Get data from List by index & search data is present or not 
		
		Object obj2 =arr.get(3);
		System.out.println(obj2);
		
		if(obj2==null)
		{
			System.out.println("No value");
		}
		
		
		// Data array form index to index
		
		System.out.println("Data array form index to index");		
		List sublist=arr.subList(0, 2);
		System.out.println(sublist);
		
	}
	
	
}
