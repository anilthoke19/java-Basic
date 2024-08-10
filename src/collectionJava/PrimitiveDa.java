package collectionJava;

import java.util.ArrayList;

public class PrimitiveDa {
	ArrayList <Emp>h=new ArrayList<Emp>();
	public void add(ArrayList a)
	{
		h=a;
	}
	
	public void show()
	{
		for(Emp p:h)
		{
			System.out.println(p.id+" "+p.name);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		PrimitiveDa d=new PrimitiveDa();
		UserObejct u=new UserObejct();
		d.show();

		
	}

}
