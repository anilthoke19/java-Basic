package collectionJava;
import java.util.*;

 class CollectionUser
{
int id;
String name;

public CollectionUser(int id,String name)
   {
this.id=id;
this.name=name;

   }
}
public class UserCollection {
	public static void main(String[] ssdo)
	{

	ArrayList <CollectionUser> a=new ArrayList<CollectionUser> ();

	CollectionUser u=new CollectionUser(1,"anil");
	CollectionUser u2=new CollectionUser(2,"sunil");
	CollectionUser u3=new CollectionUser(3,"suru");


	a.add(u);
	a.add(u2);
	a.add(u3);


	for(int i=0;i<a.size();i++)
	{
		CollectionUser rr=a.get(i);
		//System.out.println(rr.id+" "+rr.name);
		
		if(rr.id==3)
		{
			a.remove(i);
		}
		
		System.out.println(a.indexOf(u3)+"index");
      

	}


	for(CollectionUser r:a)
	{

	System.out.println(r.id+" "+ r.name);


	}
// without Generic User 
	/*
	ArrayList  a=new ArrayList();

	CollectionUser u=new CollectionUser(1,"anil");
	CollectionUser u2=new CollectionUser(2,"sunil");
	CollectionUser u3=new CollectionUser(3,"suru");


	a.add(u);
	a.add(u2);
	a.add(u3);


	for(int i=0;i<a.size();i++)
	{
		CollectionUser rr=(CollectionUser)a.get(i);
		//System.out.println(rr.id+" "+rr.name);
		
		if(rr.id==2)
		{
			a.remove(i);
		}
      

	}


	for(Object o:a)
	{
		CollectionUser r=(CollectionUser)o;
	System.out.println(r.id+" "+ r.name);


	}

	 * 
	 * 
	 */
	
	
	
	}
	
}
