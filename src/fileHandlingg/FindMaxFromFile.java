package fileHandlingg;

import java.io.*;
import java.util.Scanner;

public class FindMaxFromFile {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		//FileWriter  f=new FileWriter("C:\\Users\\91913\\Favorites\\Desktop\\Java\\demofile.txt");
//		
//		if(f.exists()) {
//			System.out.println("file already ");
//FileWriter fr=new FileWriter(f,true);
//			//BufferedWriter br=new BufferedWriter(fr);
//	
//fr.write("anil by fileWriter");
//		fr.close();
//			
//		}
//		else {
//		f.createNewFile();
//		if(f!=null)
//		{
//			System.out.println("File created ");
//             FileWriter fr=new FileWriter(f);
//			
//			String s="Anil";
//			
//			fr.write(s);
//		}else
//		{
//			System.out.println("iin the else");
//		}
//		
//		}
//		
		
		
//		FileReader fr=new FileReader(f);
//		int c;
//		while((c=fr.read())!=-1) {
//			
//			char cc=(char)c;
//			System.out.print(cc);
//		}
//		
//		
//		
	
		
//		BufferedWriter bf=new BufferedWriter(f);
//		
//		bf.write("Welcome come");
//		
//		bf.close();
		
		
		FileReader fr=new FileReader("C:\\Users\\91913\\Favorites\\Desktop\\Java\\demofile.txt");
		
		BufferedReader bw=new BufferedReader(fr);
		
		String s=bw.readLine();
		System.out.println(s);
		
		bw.close();
		
		
		
		
	
		
	}
	
	
}
