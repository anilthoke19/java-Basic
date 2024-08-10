package featuresJava1_8;
import java.util.function.*;
public class PredicateAndPreByLambada {
public static void main(String[] args) {
	
	boolean b=((Predicate<Integer>)((Integer i)->i>5?true:false)).and((Integer j)-> j<10?true:false   ).test(7);
	
	System.out.println(b);
}
	
	
}
