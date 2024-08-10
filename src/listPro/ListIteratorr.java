package listPro;

import java.util.ArrayList;
import java.util.Iterator;

public class ListIteratorr {
	
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	
	a.add(10);
	a.add(9);
	a.add(30);
	a.add(40);
	a.add(50);
	
	Iterator i=a.iterator();
	int indexx=a.indexOf(30);
	
	a.set(indexx, 300);
	int sum=0;
	System.out.println("index of 30: "+indexx);
	while(i.hasNext())
	{
		Object d=i.next();
		sum=sum+(int)d;;
		//System.out.println(d);

	}
	
	for(int j=0;j<a.size();j++)
	{
		Object ob=a.get(j);
		System.out.println(ob);
		
	}
	
	//System.out.println(sum);
	
	
	
	
	
}
	
	
	
	
}
