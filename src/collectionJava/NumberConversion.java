package collectionJava;

import java.util.*;

import javax.print.attribute.SetOfIntegerSyntax;

public class NumberConversion {
	

	public static void main(String[] idh)
	{
		HashSet<Integer> a=new HashSet<Integer>();
a.add(435);
a.add(100);
a.add(23);


int count=1;
for(Integer g:a)
{
	if(g==23)
	{
		a.remove(100);
	}
}

System.out.println(a);
	



		
		
		
	}
	

}
