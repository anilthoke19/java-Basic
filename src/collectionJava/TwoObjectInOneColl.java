package collectionJava;

import java.util.ArrayList;

class A
{
	int a;
	public A(int a)
	{
		this.a=a;
	}
}


class B
{
	int b;
	public B(int b)
	{
		this.b=b;
	}
}

public class TwoObjectInOneColl {
	public static void main(String[] args) {
		ArrayList t=new ArrayList();
		
		 A k=new A(2);
		 B j=new B(4);
		 t.add(j);
		 t.add(k);
		 
		 for(Object obj:t)
		 {
			 A jj=(A)obj;
			 System.out.println(jj);
		 }
		 
		 
		 
		
		
	}
	

}
