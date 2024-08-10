package featuresJava1_8;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class User
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
	
	
}



public class DemoApi {
	public static void main(String[] args) {

		User u=new User();
		u.setId(1);
		u.setName("anil");
		
		User u2=new User();
		u.setId(2);
		u.setName("sunil");
		
		
		List<User > a=List.of(u,u2);
		
		Predicate<User> p=new Predicate<User>()
				{
			public boolean test(User us)
			{
				return us.getName().equalsIgnoreCase("sunil");
			}
				};
		
			
	}
	
	public static void search( ArrayList a,Predicate p)
	{
		p.test(a);
		
		
	}
	
}
