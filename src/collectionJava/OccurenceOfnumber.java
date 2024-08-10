package collectionJava;
import java.util.*;
public class OccurenceOfnumber {

	public static void main(String[] args) {
		int i,j;
		ArrayList t=new ArrayList();
		t.add(10000);
		t.add(100);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		t.add(60);
		t.add(100);
		t.add(20);
		t.add(20);

		
		OccurenceOfnumber d=new OccurenceOfnumber();
		
		for(i=0;i<t.size();i++)
		{
			for(j=i+1;j<t.size();j++)
			{
				if((int)t.get(i)>(int)(t.get(j)))
				{
					Object obj1=t.get(i);
					Object obj2=t.get(j);
					t.set(i,obj2);
					t.set(j,obj1);
				}
			}
		}
		System.out.println(t);
		
		
			
		for(i=0;i<t.size();i++)
		{
			int count=1;
			for(j=i+1;j<t.size();j++)
			{
				if(t.get(i).equals(t.get(j)))
				{
					count++;
				t.remove(j);
				j--;
				}else
				{
					break;
				}
			}
			System.out.println(count+" "+t.get(i));
		}
	
		System.out.println(t);
		
	}
	
}
