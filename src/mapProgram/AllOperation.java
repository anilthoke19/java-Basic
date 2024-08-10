package mapProgram;
import java.util.*;

public class AllOperation {
	public static void main(String[] args) {
		
		LinkedHashMap k=new LinkedHashMap();
		
		k.put(1, "anil");
		k.put(2, "sunil");
		
		LinkedHashMap p=new LinkedHashMap();
		p.put(3, "inner1");
		p.put(4, "Outer");
		
		LinkedHashMap p2=new LinkedHashMap();
		p2.put(5, k);
		p2.put(6, p);
		
//		
//		Set keys=p2.keySet();
//		for(Object obj:keys)
//		{
//			Object value=p2.get(obj);
//			
//			LinkedHashMap map=(LinkedHashMap)value;
//			Set keys2=map.keySet();
//			
//			for(Object obj2:keys2)
//			{
//				Object keys3=obj2;
//				Object value2=map.get(keys3);
//				System.out.println(keys3+" "+value2);
//				
//			}
//			
//		}

		
		
		Set keys=p2.keySet();
		Iterator i=keys.iterator();
		
		while(i.hasNext())
		{
			Object key=i.next();
			Object value=p2.get(key);
			
			
			LinkedHashMap map=(LinkedHashMap)value;
			Set ikeys=map.keySet();
			
			Iterator ii=ikeys.iterator();
			System.out.println("dep"+key);
			while(ii.hasNext())
			{
				Object ikey=ii.next();
				Object ivalue=map.get(ikey);
				System.out.println(ikeys+" "+ivalue);
			}
			
		}
		
		
		
		
		
		
			}		
	}

