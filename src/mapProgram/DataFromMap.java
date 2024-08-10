package mapProgram;

import java.util.*;

public class DataFromMap {
	
	
	void show()
	{
		
		Map<Integer,ArrayList > p=new LinkedHashMap<>();
		
		ArrayList<Integer> ar=new ArrayList();
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		ArrayList<Integer> ar2=new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		p.put(1,ar);
		p.put(2,ar2);
		
		
		Set s= p.keySet();
		
		Iterator<Integer> it=s.iterator();
		
		while(it.hasNext())
		{
			
			//Integer s2=it.next();
			//System.out.println(s2);
			
			ArrayList ar3=(ArrayList) p.get(it.next());
			
			for(Object j:ar3)
			{
				
				System.out.println(j);
			}
		
			
		}
		
		
	}

	public static void main(String[] args) {
		DataFromMap d=new DataFromMap();
		d.show();
	}
}
