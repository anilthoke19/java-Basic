package constructorr;
import java.util.*;


class Single
{
ArrayList k=new ArrayList();

	 int id=10;
	 String name="anil";
	
	public final static Single object=new Single();
	private Single() {
		
	}
public void setId(int id)
{
	this.id=id;
}
	
	public int getId() {
		return id;
	}
	
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}
	
	public static Single ObjectPass()
	{
		return object;
	}
	
	void addObject()
	{
		k.add(object);
	}
	
	
}




public class SingleToneEx {


	
	public static void main(String[] args) {
ArrayList ar=new ArrayList<>();
		int a;
		
		Single obj=Single.ObjectPass();
		obj.setId(10);
		obj.setName("anil");
		ar.add(obj);
		
		for(Object object:ar)
		{
			Single ss=(Single)object;
			System.out.println(ss.getId()+ss.getName()  );
			
		}
		
		
		
		
		
		
	}

}
