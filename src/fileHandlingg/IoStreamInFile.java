package fileHandlingg;
import java.io.*;
import java.util.*;

class Laptop implements Serializable
{
	int id,price;
	String name;
	public Laptop(int id, int price, String name) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	
	
}




public class IoStreamInFile {
public static void main(String[] ahd) throws Exception
{
	Laptop l=new Laptop(1,2,"hp");	
	do
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("1: write byte format in string form String ");
	System.out.println("2: Write and read image into file");
	System.out.println("3: write object in file");
	System.out.println("4: Read object from the file");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	sc.nextLine();
	
	switch(choice)
	{
	case 1:
		FileOutputStream fout=new FileOutputStream("C:\\FileHandling\\byteString.txt");
		String value=sc.nextLine();
		byte[] valueA=value.getBytes();
		fout.write(valueA);
		System.out.println("data Saved");
	break;
	
	case 2:
		FileInputStream fin=new FileInputStream("C:\\Users\\91913\\Downloads\\book3.jpg");
		FileOutputStream fout2=new FileOutputStream("C:\\FileHandling\\book3.jpg");
		int data;
		while((data=fin.read())!=-1)
		{
			fout2.write(data);
		}
		System.out.println("byte data saved");
		fin.close();
		fout2.close();
		break;
		
	case 3:
		
		FileOutputStream fout4=new FileOutputStream("C:\\FileHandling\\laptop.text",true);
		ObjectOutputStream fout5=new ObjectOutputStream(fout4);
		fout5.writeObject(l);
		fout5.close();	
		break;
		
		
	case 4:
		FileInputStream fin2=new FileInputStream("C:\\FileHandling\\laptop.text");
		ObjectInputStream obj2=new ObjectInputStream(fin2);
		Object object11=obj2.readObject();
		if(object11!=null)
		{
			Laptop p=(Laptop)object11;
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
		obj2.close();
		
		break;
		
		
		
	}
	
	}while(true);
	
	
	
	
	
	
}
	
	
	
}
