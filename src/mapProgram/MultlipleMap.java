package mapProgram;

import java.util.*;

public class MultlipleMap {
	public static void main(String[] args) {
		
	LinkedHashMap<Integer,List> m=new LinkedHashMap<Integer,List>();
	ArrayList a=new ArrayList ();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	
	ArrayList a2=new ArrayList ();
	a2.add(1);
	a2.add(2);
	a2.add(3);
	a2.add(4);

		m.put(1, a);
		m.put(2, a2);
		
		
		for(Map.Entry k:m.entrySet())
		{
			Object obj=k.getValue();
			
			ArrayList aa=(ArrayList)obj;
			
			for(Object ob:aa)
			{
				System.out.println(k.getKey()+" "+ob);
			}
			
		}
		
		
		

		
		

		
	}

}
