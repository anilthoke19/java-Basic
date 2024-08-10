
package collectionJava;
import java.util.*;
class Operation
{
	int i,size,value;
	ArrayList a=new ArrayList();
	Scanner sc=new Scanner(System.in);
	
	void add()
	{
		int no;
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(50);
		System.out.println("enter the element");
		no=sc.nextInt();
		
		a.add(no);
		
		
	}
	
	void display()
	{
		size=a.size();
		Object obj=a;
			
			System.out.println(obj);
		
		
	}
	
	void search()
	{
	
	boolean flag=false;
	System.out.println("enter the number for found");
	value=sc.nextInt();
	
	for(i=0;i<a.size();i++)
	{
		if(value==(int)a.get(i))
		{
			flag=true;
			break;
		}
	}
	
	if(flag)
	{
		System.out.println("value found");
	}else
	{
		System.out.println("value not present");
	}	
	}
	
	void remove()
	{
		System.out.println("enter the number who want to delete");
		value=sc.nextInt();
		boolean flag=false;
		for(i=0;i<a.size();i++)
		{
			if(value==(int)a.get(i))
			{
				a.remove(i);
				flag=true;
				break;
			}
		}
		
		if(flag)
		{
		System.out.println("value delete");	
		}
		else
		System.out.println("value not present");
	}
	
	void update()
	{
		int index;
		System.out.println("enter the value and index for updation");
		value=sc.nextInt();
		index=sc.nextInt();
		
		a.set(index, value);	
	}
	
	void sizeAList()
	{
		int size=a.size();
		System.out.println("Size of array List is "+size);
	}
	
}


public class OperationOnArrayList {
	public static void main(String[] ah)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		Operation o=new Operation();
		
		do {
			System.out.println("1: Add element");
			System.out.println("2: display element");
			System.out.println("3: Remove element");
			System.out.println("4: Search element");
			System.out.println("5: Update  element");
			System.out.println("6: size of array List element");
			System.out.println("0: exit ");
			
			System.out.println("enter choice ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				o.add();
				break;
				
			case 2:
				o.display();
				break;
				
			case 3:
				o.search();
				break;
				
			case 4:
				o.remove();
				break;
				
			case 5:
				o.update();
				break;
				
			case 6:
				o.sizeAList();
				break;
				
			case 7:
			   System.exit(0);
				break;
			}
			
		}while(true);
	
	}

}
