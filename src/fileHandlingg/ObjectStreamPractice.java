package fileHandlingg;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student4 implements Serializable {
	
	private int id ;
	private String name;
	private String address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}

public class ObjectStreamPractice implements Serializable {

	Student4 s=new Student4();
	
	public void CreateFileText()
	{
		File f=new File("C://java//DemoStudent.txt");
		if(f.exists())
		{
			System.out.println("File alredy present ");
		}else 
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void addIntoObject()
	{
		s.setId(1);
		s.setAddress("Pune");
		s.setName("sunil");
		
		try {
		FileOutputStream obj=new FileOutputStream("C://java//DemoStudent.txt",true);
		ObjectOutputStream obj2=new ObjectOutputStream(obj);
		obj2.writeObject(s);
		
		
		System.out.println("Data Inserted in file");
		
		}catch(Exception e)
		{
			System.out.println(e+" data not inserted in file");
		}

		
		
	}
	
	public void readFData() throws Exception
	{
	
		FileInputStream fi=new FileInputStream("C:\\java\\DemoStudent.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);

		Object obj3=oi.readObject();
	   
		if(obj3!=null)
		{
			Student4 s=(Student4)obj3;
			System.out.println(s.getAddress());
		}
	
	
	
    
	}
	public static void main(String[] args) throws Exception {
		ObjectStreamPractice ob=new ObjectStreamPractice();
//		ob.CreateFileText();
//		ob.addIntoObject();
		
			ob.readFData();
		
		
		
		
		
	}
	
}
