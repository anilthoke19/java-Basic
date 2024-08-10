package mapProgram;
import java.util.*;

class Mobile
{
	int id,price;

	public Mobile(int id, int price) {
		super();
		this.id = id;
		this.price = price;
	}
	
}



public class MapOperation {
	public static void main(String[] args) {
		
	LinkedHashMap p=new LinkedHashMap();
	
	Mobile m=new Mobile(1,2);
	Mobile m2=new Mobile(11,22);
	Mobile m3=new Mobile(33,44);
	Mobile m4=new Mobile(44,55);



	

	ArrayList<Mobile> a=new ArrayList<Mobile>();
	a.add(m);
	a.add(m2);
	a.add(m3);
	a.add(m4);
	
	int sum=0;
	for(Mobile  i:a) {
		
	System.out.println(i.id+" "+i.price);
		
		
	}
	
		
		
		
	}

}
