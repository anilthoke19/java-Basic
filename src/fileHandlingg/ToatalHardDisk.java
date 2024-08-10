package fileHandlingg;
import java.io.*;
import java.io.File;

public record ToatalHardDisk() {
	public static void main(String[] args)throws IOException {
		

//		//checking disk in pc
//		
//		File f[]=File.listRoots();
//		
//		for(int i=0;i<f.length;i++)
//		{
//			System.out.println(f[i].getTotalSpace()+" "+f[i].getFreeSpace());
//		}
		
		
		//Create folder in Drive
		
		File f=new File("C:\\java\\java notes\\NewFolder");
		boolean b=f.mkdir();
		
		if(b)
		{
			System.out.println("folder is create ");
		}else
		{
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//File create=new File("C:\\Users\\91913\\Downloads\\newJava.txt");
//
//	//a.mkdir();
// boolean b=a.exists();
// if(b) {
//	
//		System.out.println("folder is present");
//	}else
//	{
//		System.out.println("folder is not present");
//	}
 
		
//		//Check folder or File display
//	File check=new File("C:\\Users\\91913\\Downloads");
//	
//	File f1[]=check.listFiles();
//	for(int i=0;i<f1.length;i++)
//	{
//		//if(f1[i].isDirectory())
//		
//		if(f1[i].isDirectory()) {
//		System.out.println(f1[i]);
//		}
//	}

	
//		// for checking file in the folder 
//		
//		File f2=new File("C:\\Users\\91913\\Downloads");
//		
//		File list2[]=f2.listFiles();
//		
//		for(int i=0;i<list2.length;i++)
//		{
//			if(list2[i].isFile())
//			{
//				System.out.println(list2[i]);
//			}
//			
//		}
//		
	


 
 

	}
}
