package constructorr;
import java.util.*;

class Emp
{
	int id;
	String name;
	
	public Emp(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}


class RemoveS
{
	ArrayList<Integer > a2=new ArrayList<Integer>();

	ArrayList<Integer > a=new ArrayList<Integer>();
	ArrayList a3=new ArrayList ();

	void show() {
	
		a.add(10);
		a.add(50);
		a.add(30);
		a2.add(10);
		a2.add(50);
		a2.add(30);
		a2.add(1000);
		System.out.println("checking equals arrayList");
		boolean d=a.equals(a2);
		System.out.println(d);
		
		// retaine All : show present in both arrayList
		
				a.retainAll(a2);
				System.out.println("By reatining list "+a);
		
//		// remove list
//		a2.removeAll(a);
//		System.out.println("remaining "+a2);
//	
		
		
		a.addAll(a2); //add 2nd arrray in first
		
		System.out.println("bu using  iterator ");
		Iterator i=a.iterator();
		
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
		
		System.out.println("by using for loop");
		for( int j=0;j<a.size();j++)
		{
			Object obj=a.get(j);
			
			System.out.println(obj);
			
			
		}
		
		System.out.println("By using for each loop");
		for(Object obj:a)
		{
			System.out.println(obj);
		}
		
		
		
		System.out.println("By using ListIterstor by previous");
		
		ListIterator h=a.listIterator(a.size());
		
		while(h.hasPrevious())
		{
		Object obj=h.previous();	
	System.out.println(obj);
			
		}
		
		System.out.println("Listiterator by usig forward ");
		ListIterator k=a.listIterator();
		
		while(k.hasNext())
		{
			Object obj=k.next();
			
			System.out.println(obj);
		}
		
		System.out.println("Sorting list");
		
		Collections.sort(a);
		
		for(Object obj:a)
		{
			System.out.println(obj);
		}
		System.out.println("check empty or not: ");
		boolean b=a.isEmpty();
		
		if(b==true)
		{
			System.out.println("List is empty");
		}else
		{
			System.out.println("List is not empty");
		}
		
		// user defined 
		
		Emp p=new Emp(1,"anil");
		Emp p2=new Emp(2,"sunil");
		Emp p3=new Emp(3,"nil");
		
		
		a3.add(p);
		a3.add(p2);
		a3.add(p3);
		
		Iterator i3=a3.iterator();
		
		while(i3.hasNext())
		{
			
			Object obj=i3.next();
			Emp e2=(Emp)obj;
			
			System.out.println(e2.id+" "+e2.name);
			
		}
		
		
		
		
	
		
	}
	
	
}

public class ArrayListMethodAll {
	public static void main(String[] args) {
		RemoveS s=new RemoveS();
		s.show();

	}
}
