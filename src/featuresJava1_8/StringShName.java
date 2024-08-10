package featuresJava1_8;
import java.util.*;

import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class StringShName {
public static void main(String[] args) {

List <String > a=List.of("satish","atish","rajesh","anil","ssunil","somesh");

Stream<String > s=a.stream();

Predicate<String > pr=new Predicate<String>()
{
	public boolean test(String ps)
	{ 
		return ps.endsWith("sh");
	}
};

Stream<String> st=s.filter(pr);

List<String > ar=st.collect(Collectors.toList());

Consumer<String >cc=new Consumer<String>()
{
	public void accept(String s)
	{
		System.out.println(s);
	}
	
	
};

ar.forEach(cc);
			
}
	
}
