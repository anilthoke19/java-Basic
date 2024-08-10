package mapProgram;
import java.util.*;
public class MapFetchData {
	public static void main(String[] args) {
		
		LinkedHashMap <Integer,List> m=new LinkedHashMap<Integer,List>();
		
		ArrayList a=new ArrayList();
		a.add(1);
		a.add("sunil");
		
		ArrayList a2=new ArrayList();
		a2.add(2);
		a2.add("vishal");
		
		m.put(1,a);
		m.put(2,a2);

		
		Set <Map.Entry<Integer,List>> s=m.entrySet();
		
		for(Map.Entry<Integer,List> m2:s)
		{
			List list=m2.getValue();
			ArrayList g=(ArrayList)list;
			
			for(int i=0;i<list.size();i++) {
				System.out.println(m2.getKey()+" "+g.get(i)+" ");
				
			}
			
		}
		
		
	
		
		
		
		
	}

}
