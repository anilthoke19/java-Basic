package mapProgram;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class IndiaAus {
	public static void main(String[] args) {
		
		
		
		LinkedHashMap a=new LinkedHashMap();

		a.put(1,"sachin");
		a.put(2,"Sehwag");
		a.put(3,"Yuvraj");
		
		LinkedHashMap b=new LinkedHashMap();
		b.put(4,"finch");
		b.put(5,"warner");
		b.put(6,"jordy");
		
		LinkedHashMap p=new LinkedHashMap();
		p.put("India", a);
		p.put("aus", b);
		
		
		
		Set keys=p.keySet();
		Iterator i=keys.iterator();
		
		while(i.hasNext())
		{
		
			Object obj=i.next();
			System.out.println(obj+" "+p.get(obj));
		}
		
		
		
		
	}

}
