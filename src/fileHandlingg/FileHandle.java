package fileHandlingg;
import java.io.*;
import java.util.*;
import java.util.*;

public class FileHandle {
	
public static void main(String[] args) throws IOException {
	int choice;
	String name;
	Scanner sc=new Scanner(System.in);
	FileWriter f=new FileWriter("C:\\FileHandling\\Case.txt",true);
	FileReader fr=new FileReader("C:\\FileHandling\\Case.txt");
	
			
			
			do{
    	System.out.println("1: write into file by filewriter");
    	System.out.println("2: Write into file by fileWirtterBuffer");
    	System.out.println("3: Read data from file by fileReader");
    	System.out.println("4: read data from fule using fileReaderBuffer");
    	System.out.println("5: check disk in the system");
    	System.out.println("6: check file and folder in file ");
    	System.out.println("7: check file in the Folder");
    	System.out.println("8: check the folder in the given Path ");
    	   
    	System.out.println("enter your choice");
    	choice=sc.nextInt();
    	switch(choice)
    	{
    	case 1:
    		sc.nextLine();
    		System.out.println("enter the data for file");
    		name=sc.nextLine();
    		f.write(name);
    		//f.close();
    		
    		break;
    		
    		
    		
    	case 2:
    		sc.nextLine();
    		System.out.println("Enter String for file ");
    		name=sc.nextLine();
    		
    		BufferedWriter br=new BufferedWriter(f);
    		br.write(name);
    		br.newLine();
    		br.close();
    		
    		
    		break;
    		
    	case 3:
    		int no;
    		while((no=fr.read())!=-1)
    				{
    			
    			char ch=(char)no;
    			System.out.print(ch);
    				}
    		
    		break;
    		
    	case 4:
    		String value;
    		BufferedReader fr2=new BufferedReader(fr);
    		
    		while((value=fr2.readLine())!=null)
    		{
    			System.out.println(value   );
    		}
    		break;
    		
    	case 5:     // check disk file and folder 
    		
    		File fread=new File("C:\\FileHandling");
    		File f3[]=fread.listRoots();
    		
    		for(int i=0;i<f3.length;i++)
    		{
    			System.out.println(f3[i]);
    			System.out.println("Total space in bits"+f3[i].getTotalSpace());
    			System.out.println("Free space in the file "+(f3[i].getFreeSpace())/(1024*1024*1024)+"GB");
    		}
    		
    		break;
    		
    		
    	case 6:      // check file and folder in path 
    		File f5=new File("C:\\FileHandling");
    		File list[]=f5.listFiles();
    		
    		for(int i=0;i<list.length;i++)
    		{
    			System.out.println(list[i]);
    		}
    		
    		break;
    		
    		
    	case 7:    // checking only file in path 
    		File f6=new File("C:\\FileHandling");
    		File doc[]=f6.listFiles();
    		for(int i=0;i<doc.length;i++)
    		{
    			if(doc[i].isFile()) {
    			System.out.println(doc[i]); 
    			}
    		}
    		
    		break;
    		
    	case 8:
    		File f8=new File("C:\\java");
    		File folder[]=f8.listFiles();
    		
    		for(int i=0;i<folder.length;i++)
    		{
    			if(folder[i].isDirectory())
    			{
    				System.out.println(folder[i]);
    			}
    		}
    		
    		break;
    		
    		
    		
    		
    		default:
    			System.out.println("enter wrong choice");
    	
    	
    	
    	}
    	
    	
    	
    }while(true);
	
	
	

		
		
		
			
			
		
	
}
	
	
	
}
