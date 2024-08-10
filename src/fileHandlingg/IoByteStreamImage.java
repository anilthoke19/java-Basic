package fileHandlingg;
import java.io.*;

public class IoByteStreamImage {
	public static void main(String[] args)throws Exception {
		
		
		FileOutputStream o=new FileOutputStream("C:\\FileHandling\\Self.jpg");
		
		FileInputStream i=new FileInputStream("C:\\Users\\91913\\Downloads\\wp2539876-tessa-thompson-wallpapers.jpg");
		
		int data ;
		while((data=i.read())!=-1)
		{
			
			o.write(data);
		}
		o.close();
		i.close();
		
		System.out.println("Data saved");
		
		
		
		
		
	}

}
