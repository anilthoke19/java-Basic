package mapProgram;
import java.util.*;
import java.io.*;
public class MapBasic {
	
	
	public static void main(String[] args) throws IOException {
		

		
//		FileWriter f=new FileWriter("C:\\java\\Tech Notes\\checkFolder\\new.txt",true);
//		f.write("anil");
		
		FileReader f2=new FileReader("C:\\java\\Tech Notes\\checkFolder\\new.txt");
		int d;
		while( (d=f2.read())!=-1)
		{
			char ch=(char)d;
			System.out.println(ch);
		}

		
		
		f2.close();

		
			
		
		
		
		
	
	
	}
	

}
