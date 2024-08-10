package collectionJava;

import java.util.*;

class Emp
{
	int id;
	String name;
	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
}



public class UserObejct {
	public static void main(String[] args) {
		ArrayList<Emp> ar=new ArrayList<Emp>();
		
		Emp p=new Emp(1,"anil");
		Emp p2=new Emp(2,"sunil");
		Emp p3=new Emp(3,"suru");
		Emp p4=new Emp(4,"yog");
		
		ar.add(p);
		ar.add(p2);
		ar.add(p3);
		ar.add(p4);
	

		Iterator<Emp> i=ar.iterator();
		
		while(i.hasNext())
		{
		Emp k=i.next();
if (k.id==2)
{
	i.remove();
}
			
		}
		
		for(Emp j:ar)
		{
			System.out.println(j.id+" "+j.name);
		}
		
		
		
	}

}
