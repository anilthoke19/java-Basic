package collectionJava;
import java.util.*;
import java.util.Map.Entry;
public class PrimitiveTy {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int no;
		
		LinkedHashMap a=new LinkedHashMap ();
		
		a.put(1, 10);
		a.put(2,20);
		a.put(3, 30);
		a.put(4,40);
		a.put(5, 50);
		a.put(6,60);
		
		
		Set<Entry> map=a.entrySet();
		
		for(Entry o:map)
		{
			System.out.println(o.getKey()+" "+o.getValue());

		}
		
		
		
	
	}

}
