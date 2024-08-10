package collectionJava;
import java.util.*;

public class Crudeoperation {
	
	public static void main(String[] args) {

		ArrayList ar=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		 
		System.out.println("enter a String");
		String name=sc.nextLine();
		
		String value[]=name.split(" ");
		
		System.out.println(value.length);
//		for(String n:value) {
//			ar.add(n);
//		}
		
		for(int i=0;i<value.length;i++)
		{
			ar.add(value[i]);
		}
		int count=0;

		System.out.println("enter a word ");
		String word=sc.nextLine();

		for(Object obj:ar)
		{
			if(obj.toString().equals(word))
			{
			count++;
			}
		}
		
		System.out.println("repeate word "+count );
		
	}

}
