package mapProgram;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public record MapMethod() {
	public static void main(String[] args) {
		
		HashMap p=new HashMap();
		p.put(1, "anil");
		p.put(44,"sunil");
		p.put(3, "dyanu");
		p.put(4, "yogesh");
		
		Set <Map.Entry> j=p.entrySet();
		
		for(Map.Entry h:j)
		{
			System.out.println(h.getKey()+" "+h.getValue());
		}
		
		int size=p.size();
		System.out.println("size of map is: "+ size);
		
		boolean b=p.isEmpty();
		if(b)
		System.out.println(" empty");
		else
			System.out.println("not empty");
		
		
		
		boolean f=p.containsKey(3);
		if(f)
		{
			System.out.println(" key found");
		}else
			System.out.println("not found key");
		
	}

}
