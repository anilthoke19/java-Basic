package featuresJava1_8;
import java.util.ArrayList;
import java.util.List;
//@FunctionalInterface
import java.util.function.*;

public class DemoInner {
public static void main(String[] args) {
	
Consumer<Object > c=(Object t)->
System.out.println(t);
		

ArrayList aa=new ArrayList();
aa.add(10);
aa.add(20);
aa.add(343);
aa.add(99);

aa.forEach(c);
	
}


	
	
}
