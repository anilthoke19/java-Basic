package featuresJava1_8;

import java.util.function.Predicate;

class Car4{
	
	int price;
	String name;
}



public class ConsumerM  
{

	
	
	public static void main(String[] args) {

		Predicate<Integer> p=new Predicate<Integer>() {
			
		public boolean test(Integer i) {
			
			return i<20?true:false;
		}  
	};
	
	Predicate<Integer>p2=new Predicate<Integer>() {
		public boolean test(Integer j)
		{
			return (j>10)?true:false;
			
		}
		
	};
	
	Predicate<Integer> bb=p.and(p2);
	
	boolean b2=bb.test(15);
	
	if(b2)
		System.out.println("true");else System.out.println("fasle");;
	
	

	
	}
	
}
