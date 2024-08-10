package featuresJava1_8;

import java.util.*;
import java.util.function.Consumer;

public class ConsumeInnerClass {
public static void main(String[] args) {

	
	Consumer m=new Consumer<Integer>()
			{
		public void accept(Integer t) {
			System.out.println(t);
			
		}
		
		
			};
			
			
			ArrayList <Integer> a  =new ArrayList<Integer>();
			a.add(12);
			a.add(131);
			a.add(1221);
			a.add(908);
			
			a.forEach(m);
}
	
	
}
