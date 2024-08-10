package mapProgram;
import java.util.*;
class Product 
{
	int id;
	String name;
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product()
	{
		
	}
	
	public Product(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

public class MapByPOJO {
	public static void main(String[] args) {
		 Product p[]=new Product[3];
		 p[0]=new Product(1,"anil");
		 p[1]=new Product(2,"sunil");
		 p[1]=new Product(3,"vivek");
		 
		 LinkedHashMap k=new LinkedHashMap();
		 
		 k.put("product", p);
		 
		 Set s=k.keySet();
		 
		 Iterator i=s.iterator();
		 while(i.hasNext())
		 {
			 Object obj=i.next();
			
			 Product pp=(Product)obj;
			 System.out.println(pp.getId()+" "+pp.getName());
   		 }

		 
		 
		
		
	}
	
}
