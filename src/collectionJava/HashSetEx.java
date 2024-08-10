package collectionJava;

import java.util.*;

public class HashSetEx {
	
	public static void main(String[] args) {
		TreeSet<Integer> h=new TreeSet<Integer>();
	
		List<Integer> ar=List.of(2,5,4,6,7,8,11,2,444,5,2,5,3,6,5,7,8,9,323,3,23,454,45);
		
		TreeSet<Integer> h2=new TreeSet<>(ar);
		
		for(Integer i:h2)
		{
			System.out.println(i);
		}
		
		
	}
	
	

}
