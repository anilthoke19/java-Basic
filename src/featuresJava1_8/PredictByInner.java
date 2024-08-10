package featuresJava1_8;

import java.util.function.Predicate;

public class PredictByInner {
	public static void main(String[] args) {
		
		Predicate<Integer> p=new Predicate<Integer>() {
			
			public boolean test(Integer i)
			{
				if(i>5)
				return true;
				else 
					return false;
			}
		};
		
		boolean j=p.test(10);
		System.out.println(j);
		
	}

}
