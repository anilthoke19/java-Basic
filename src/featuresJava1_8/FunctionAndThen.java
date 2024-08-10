package featuresJava1_8;
import java.util.function.*;

public class FunctionAndThen {
public static void main(String[] args) {
	
	
	Function <Integer,Integer > f=new Function<Integer,Integer>()
			{

			
				public Integer apply(Integer t) {
					int m=t*10;
					return m;
				}
			};
			
			Function <Integer,Integer> f2=new Function<Integer,Integer>()
					{
				public Integer apply(Integer g)
				{
					int sum=g*10;
					return sum;
				}
				
					};
	
	
					Function <Integer ,Integer> f3=f.andThen(f2);
					int summ=f3.apply(10);
					System.out.println(summ);
					
}
	
	
	
}
