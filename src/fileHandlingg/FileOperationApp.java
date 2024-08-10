package fileHandlingg;

import java.io.*;
import java.util.*;

 class EmployeeD implements Serializable {
	
	int id;
	String name,address;
	
	
	
	public EmployeeD(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	

}



public class FileOperationApp  {
	
	

public static void main(String[] arg) throws IOException, ClassNotFoundException{
EmployeeD emp=new EmployeeD(3,"anil","Pune");
EmployeeD emp2=new EmployeeD(4,"sunil","Hingoli");

//FileOutputStream s=new FileOutputStream("C:/Users/91913/Favorites/Desktop/CoreJavaToday/Today/newFolder/demo.txt",true);
//
//ObjectOutputStream o=new ObjectOutputStream(s);
//o.writeObject(emp);
//o.writeObject(emp2);
//
//System.out.println("inserted ");


FileInputStream f =new FileInputStream("C:/Users/91913/Favorites/Desktop/CoreJavaToday/Today/newFolder/demo.txt");

ObjectInputStream os=new ObjectInputStream(f);

Object obj;
try {
while((obj=os.readObject())!=null)
{
	EmployeeD ee=(EmployeeD)obj;
	System.out.println(ee.id+ee.name);
}

}catch(Exception e)
{
	System.out.println("All data End from file ");
}

}


}
