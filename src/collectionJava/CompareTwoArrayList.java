package collectionJava;
import java.util.*;


class BookD implements Comparable
{
int id;
String name;

public BookD(int id,String name)
{
	this.id=id;
	this.name=name;
}



public int compareTo(Object obj)
{
	BookD j=(BookD)obj;
	
	if(j.id>this.id)
		return -1;
	
	else if(j.id<this.id)
		return 1;
	else
		return 0;
	
	
}




}



class Book
{
	
	
	
}





public class CompareTwoArrayList {
	public static void main(String[] dsj) throws CloneNotSupportedException
	{
	BookD b=new BookD(1,"j");
	BookD b2=new BookD(2,"ja");
	BookD b3=new BookD(666,"java");
	BookD b4=new BookD(10,"python");
	ArrayList a=new ArrayList();
	a.add(b);
	a.add(b2);
	a.add(b3);
	a.add(b4);
	
	
	Collections.sort(a);
	
	for(Object obj:a)
	{
		BookD g=(BookD)obj;
		System.out.println(g.id+" "+g.name);
	}
	
	
		
	}

}
