package collectionJava;
import java.util.*;


public class SortingArray {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	
	int arr[]=new int [] {2,55,6,1,3,88,99,33,11};

	
	
	for(int i=0;i<arr.length;i++)
	{
		a.add(arr[i]);
	}
	
for(int i=0;i<a.size();i++)
{
	for(int j=i;j<a.size();j++)
	{
		int no=(Integer)a.get(i);
		int no2=(Integer)a.get(j);
		if(no>no2)
		{
			a.set(i, no2);
			a.set(j, no);
		}
	}
}

System.out.println(a );
	
	}
}
