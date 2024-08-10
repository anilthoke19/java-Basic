package mapProgram;
import java.util.*;
import java.util.Map.Entry;



public class MapDemo {
	public static void main(String[] args) {
		
		
		
		LinkedHashMap<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
		
		m.put(1, 100);
		m.put(2, 200);
		m.put(3, 300);
		m.put(4, 400);
		m.put(5, 500);
		
		
		Set k=m.keySet();
		
		for(Object kys:k)
		{
			Object obj=m.get(kys);
			System.out.println(obj);
		}
		
		Set<Entry<Integer, Integer>> cc=m.entrySet();

		for(Map.Entry v:m.entrySet())
		{
			System.out.println(v.getKey()+" "+v.getValue());
		}
		
		
	
		
		
	}

}
