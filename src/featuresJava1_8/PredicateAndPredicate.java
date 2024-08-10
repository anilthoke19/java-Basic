package featuresJava1_8;
import java.util.function.*;
public class PredicateAndPredicate {
public static void main(String[] args) {
	
	Predicate <Integer > p=new Predicate<Integer>()
			{		
		public boolean test(Integer  t) {
			if(t>5) {
			return true ;}
			else {
				return false ;
			}
		}
			};
			
			Predicate<Integer> p2=new Predicate<Integer >()
					{
				public boolean test(Integer i)
				{
					if(i<15)
					return true;
					else
						return false;
				}
					};
					
					Predicate <Integer > p3=p.and (p2);
					boolean b=p3.test(10);
					if(b)
					{
						System.out.println("value is between ");
					}else
						System.out.println("value is not between");
							
	
	
	
	
	
	
}
}
