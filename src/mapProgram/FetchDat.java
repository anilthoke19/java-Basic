package mapProgram;
import java.util.*;
import java.util.Map.Entry;

public class FetchDat {
	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList();
		ar.add("Pune");
		ar.add("Aurangabad");
		ar.add("Hingoli");
	
	LinkedHashMap<Integer,List> p=new LinkedHashMap<Integer,List>();
	
	p.put(1,ar);
	
	
 
	
	Set <Map.Entry<Integer, List>> s=p.entrySet();
	
	
	for(Entry<Integer, List> j:s)
	{
		System.out.println(j.getKey()+" "+j.getValue());
		
		ArrayList<String > ar2=(ArrayList)j.getValue();
		
		for(String aa:ar2)
		{
			System.out.println(aa);
		}
		
	}
	
	  
	

	
	
	
	
	
	
	}
}
