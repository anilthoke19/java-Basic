package featuresJava1_8;
import java.util.*;
import java.util.function.Consumer;

class Consum implements Consumer<Integer >
{

	public void accept(Integer i) {
		System.out.println(i);
	}
	
}



public class ConsumerDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer > a=new ArrayList<Integer >();
		
		a.add(10);
		a.add(30);
		a.add(79);
		a.add(300);
		a.add(70);
		
		Consum  m=new Consum();
		a.forEach(m);
		
		
		
		
		
	}

}
