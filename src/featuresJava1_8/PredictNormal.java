package featuresJava1_8;
import java.util.function.Predicate ;
class PredictImp implements Predicate<Integer>
{
	public boolean test(Integer  t) {
		if(t>20)
		return false;
		else
			return true ;
	}
}


public class PredictNormal {
	public static void main(String[] args) {
		
		PredictImp p=new PredictImp();
	boolean b =p.test(10);
	System.out.println(b);
		
		
		
	}

}
