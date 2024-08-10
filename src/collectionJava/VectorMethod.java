package collectionJava;

import java.util.Collection;
import java.util.Vector;

public class VectorMethod {
	
	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		int vc=v.capacity();
		System.out.println("initial Capacity is : 10");
		System.out.println("memory before  value: "+vc);
		v.add(50);
		int vcc=v.capacity();
		System.out.println("memory after crossing limit : "+vcc);
		
		
		// Intial capacity set by user
		
		Vector vt=new Vector(3);
		System.out.println("\nvalue set by user: "+vt.capacity());
		vt.add(20);
		vt.add(30);
		vt.add(40);
		vt.add(50);
		System.out.println("value got double after limit : "+vt.capacity());

		
		//increament capacity by user 
		Vector vi=new Vector(3,2);
		System.out.println("\nvalue set by user: "+vi.capacity());
		vi.add(20);
		vi.add(30);
		vi.add(40);
		vi.add(50);
		System.out.println("value increaent by 2 : "+vi.capacity());

		
	}

}
