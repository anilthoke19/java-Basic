package featuresJava1_8;

import java.util.function.Function;

public class LambadaMultipleLine{
public static void main(String[] args) {


	Function<Integer, Integer> f=new Function<Integer, Integer>() {
		
		public Integer apply(Integer i)
		{
			
	return i*10;
		}
		
	};
	
	System.out.println(f.apply(20));
	
	
	
	
	
}
	
}
