package collectionJava;
import java.util.*;

class Fetch
{
	
	Vector a;
	void add(Vector  a)
	{
		this.a=a;
		
	}
	
	Stack v=new Stack();
	
	void fetchingData()
	{
		int choice;	
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("1: by Iteration");
			System.out.println("2: by for Each loop");
			System.out.println("3: by for loop ");
			System.out.println("4: by Enumeration");
			System.out.println("5 : by list Iteration");
			System.out.println("6 : by for each method");
			System.out.println("--- 0 : for exit ---");
			
			System.out.println("Enter your choice");
			 choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				Iterator i=a.iterator();
				
				while(i.hasNext())
				{
					Object obj=i.next();
					System.out.println(obj);
				}
				break;
				
			case 2:
		
				for(Object obj:a)
				{
					System.out.println(obj);
					
				}
				break;
				
            case 3:
				for(int j=0;j<a.size();j++)
				{
					Object obj=a.get(j);
					System.out.println(obj);
				}
				break;
				
			case 4:
				Enumeration e=a.elements();
				
				while(e.hasMoreElements())
				{
					Object obj=e.nextElement();
					System.out.println(obj);
				}
				break;
				
		    case 5:
				ListIterator l=a.listIterator(a.size());
				
				while(l.hasPrevious())
				{
					Object ob=l.previous();
					System.out.println(ob);
				
				}
				
		    	
		    	
				break;
					
		    case 6:
		    	
		    	a.forEach((val)-> System.out.println(val));
		    	
		    	
				break;
				
				default:
					System.out.println("Thank You");
					System.exit(0);
				
			
			}
			
		}while(choice<6);
		
	}
	
	
	
	
	
	
	void show()
	{
		for(Object obj:a)
		{
			System.out.println(obj);
		}
		
		
	}
	
	
}





public class CollectionDataFetchWays {
	public static void main(String[] args) {
		Vector ar=new Vector();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		Fetch  f=new Fetch();
		f.add(ar);
		f.fetchingData();
		
		
		
		
		
		
		
		
	}

}
