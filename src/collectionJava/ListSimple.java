package collectionJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ListSimple {
	
	public static void main(String[] args) {
//		Object obj[]=new Object[5];
//		obj[0]=100;
//		obj[1]=4.5f;
//		obj[2]=false;
//		obj[3]=new java.util.Date();
//		obj[4]="good";
//		for(int i=0;i<obj.length;i++) {
//			System.out.println(obj[i]);
//		}
		
		
		ArrayList arr=new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		
		Object obj=arr;
		System.out.println(obj);

		arr.remove(3);
			System.out.println("after deletion"+obj);
			
		arr.add(3, 400);
		System.out.println("after adding value"+obj);
		
		boolean b=arr.isEmpty();
		if(b)
		System.out.println("collection is empty");
		else 
			System.out.println("collection is not empty");
		
		Object obj2[]=arr.toArray();
		System.out.println(obj2[2]+" " +obj2[1]);
		
	

		
	}


}
