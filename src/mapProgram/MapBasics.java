package mapProgram;
import java.util.*;
class Vehical
{
	LinkedHashMap p=new LinkedHashMap();
	
	ArrayList ar=new ArrayList();
int id,price;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Vehical()
{
	
}
public Vehical(int id, int price, String name) {
	
	this.id = id;
	this.price = price;
	this.name = name;
}

void add(Vehical... v)
{
	for(int i=0;i<v.length;i++)
	{
		ar.add(v[i]);
	}

}

void addMap()
{

p.put("anil", ar);

Set k=p.keySet();

Iterator i=k.iterator();

while(i.hasNext())
{
	Object obj=i.next();
	Object value=p.get(obj);
	
	ArrayList a=(ArrayList)value;
	for(Object ob:a)
	{
		System.out.println(ob);
	}
	
	
	
}



	
}




void display()
{
	for(Object obj:ar)
	{
		Vehical v=(Vehical)obj;
		System.out.println(v.getId()+" "+v.getName());
	}
}




}
public class MapBasics {
	public static void main(String[] args) {
		
		Vehical v=new Vehical(1,2,"PEN");
		Vehical v2=new Vehical(4,5,"MOBILE");
		Vehical v3=new Vehical(6,7,"BOOK");
	v.add(v,v2,v3);
	v.display();
	v.addMap();
	v.display();


		
		
	}

}
