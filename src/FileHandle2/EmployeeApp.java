package FileHandle2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Van implements Serializable
{
	private int id;
	private String name;
	
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

public class EmployeeApp {

	public static void main(String[] args) throws Exception  {
	
//		Van v=new Van();
//		v.setId(1);
//		v.setName("sunil");
//		
//		FileOutputStream f=new FileOutputStream("C:\\FileHandling\\newDept.txt",true);
//		ObjectOutputStream os=new ObjectOutputStream(f);
//		
//		os.writeObject(v);
//		
//		
		FileInputStream ff=new FileInputStream("C:\\FileHandling\\newDept.txt");
		ObjectInputStream obj=new ObjectInputStream(ff);
		
		Object ob=obj.readObject();
		
		if(ob!=null)
		{
			Van vv=(Van)ob;
			
		System.out.println(vv.getId()+" "+vv.getName());
			
		}
		
		
	
		
	}
	
}
