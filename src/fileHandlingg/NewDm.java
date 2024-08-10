package fileHandlingg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NewDm {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectStreamPractice ob=new ObjectStreamPractice();
		//ob.CreateFileText();
		//ob.addIntoObject();
		
			//ob.readFData();
		
		FileInputStream fi=new FileInputStream("C:\\java\\DemoStudent.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);

		Object obj3=oi.readObject();
	   
		fi.close();oi.close();
		
		
	}
}
