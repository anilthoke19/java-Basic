package featuresJava1_8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerByLambada {

	public static void main(String[] args) {
		Consumer<Integer> c=(Integer i)->System.out.println(i);
		
		ArrayList<Integer> a=new ArrayList();
		a.add(12);
		a.add(22);
		a.add(2944);
		a.add(93812);
		
		a.forEach(c  );
		
		
	}
}
