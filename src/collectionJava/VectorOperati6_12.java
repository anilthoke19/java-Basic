package collectionJava;

import java.util.Scanner;
import java.util.Vector;

public class VectorOperati6_12 {
	public static void main(String [] hbd)
	{
		int value;
	Scanner sc=new Scanner(System.in);	
		Vector v=new Vector();
		
		do {
			
			System.out.println("1: Add new Integer element");
			System.out.println("2: View all Data ");
			System.out.println("3: Search Integer data");
			System.out.println("4: Delete data from  collection");
			System.out.println("5: Replace data on specific condition");
			System.out.println("6: count total data from ollection");
			int choice;
	System.out.println("Enter the choice");
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("Ente element");
		value=sc.nextInt();
		v.add(value);
		System.out.println("value added\n");
		break;
		
	case 2:
		
		for(int i=0;i<v.size();i++) {
			System.out.println(" "+v.get(i));}
		//System.out.println(v);
		
		break;
		
	case 3:
		boolean flag=false;
		// search element data in collection
		System.out.println("enter search element");
	value=sc.nextInt();
		
		for(int i=0;i<v.size();i++)
		{
			if((int)v.get(i)==value)
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println("Element present");
		}else
		{
			System.out.println("Element not present");
		}
		
		break;
		
	case 4:
		//Delete data from collection
		System.out.println("enter deletee element");
		value=sc.nextInt();
		for(int i=0;i<v.size();i++)
		{
			if(value==(int)v.get(i))
			{
				v.remove(i);
			}
		}
			System.out.println("Removed element\n");
		
		break;
		
	case 5:
		// replace data from list
		System.out.println("enter deletee element and replace element ");
		value=sc.nextInt();
		int value2=sc.nextInt();
		for(int i=0;i<v.size();i++)
		{
			if(value==(int)v.get(i))
			{
				v.set(i, value2);
			}
		}
		System.out.println("Element replaced\n");
		break;
		
	case 6:
		// count total data 
		int count=0;
		for(int i=0;i<v.size();i++)
		{
			count++;
		}
		System.out.println("list element are :"+count);
		
		break;
		
		default:
			System.exit(0);
		
		
	
	
	}
	
		}while(true);
		
		
	}
}
