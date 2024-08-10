package collectionJava;
import java.util.*;
public class MaxNumberInArray {
	public static void main(String[] args) {
		
		int a[]=new int [] {11,44,2,3,77,6,1,88,9};
		
		ArrayList v=new ArrayList();
		
		for(int i=0;i<a.length;i++)
		{
			v.add(a[i]);
		}
		
		
		int max=(Integer)v.get(0);
		Object obj2=(Integer)v.get(0);
		//int max=(Integer)

		for(int i=0;i<v.size();i++)
		{
			Object obj=(Integer)v.get(i);
			int no=(Integer)obj;
			if(no<max)
			{
				max=no;
			}
		
		}
		System.out.println(max);
		
	}

}
