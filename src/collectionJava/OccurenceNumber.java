package collectionJava;
import java.util.*;
public class OccurenceNumber {

	public static void main(String[] args) {
	
		LinkedList ar=new LinkedList();
		
		int a[]=new int[] {1,2,3,4,5,6,7,8};
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(20);
		ar.add(30);
		ar.add(10);
		ar.add(20);
		ar.add(20);
		ar.add(10);
		ar.add(10);
		ar.add(50);
		
		
		
		for(int i=0;i<ar.size();i++)
		{
			int count=1;
			for(int j=i+1;j<ar.size();j++)
			{
			if(ar.get(i)==ar.get(j))
			{
				count++;
				ar.remove(j);
				j--;
				System.out.println(ar);
			}

			}
			//System.out.println(ar.get(i)+" -> count is :"+count);
		}
		
		
		
		
	}
	
	
	
}
