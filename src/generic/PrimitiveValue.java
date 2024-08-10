package generic;
import java.util.*;

public class PrimitiveValue {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(100);
		a.add(300);
		a.add(400);
		a.add(600);
		
		for(Integer obj:a)
		{
			System.out.println(obj);
		}
		
		ArrayList<String> j=new ArrayList<String>();
		
		j.add("an");
		j.add("kj");
		
		for(String s:j)
		{
			System.out.println(s);
		}


		
		
	}
	
	
	
}
