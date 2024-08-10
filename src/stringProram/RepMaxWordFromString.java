package stringProram;

import java.util.*;

public class RepMaxWordFromString {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s= "welcome to India ,welcome all India,to sj to all dh to  all h  all";
		
		String p[]=s.split(" ");
		
//		System.out.println("Enter word for reapated word ");
//	 String name=sc.nextLine();
//	 
//	 
//	 for(int i=0;i<p.length;i++)
//	 {
//		 if(name.equalsIgnoreCase(p[i]))
//		 {
//			 count++;
//			 
//		 } 
//	 }
//	System.out.println(count+" "+name);
		int count=0;
		String a=null;
		String a2=null;
	
	int max1=0,max2=0;
	
	for(int i=0;i<p.length;i++)
	{
		
		count=0;
		 a=p[i];
		for(int j=0;j<p.length;j++)
		{
			if(a.equalsIgnoreCase(p[j]))
			{
				count++;
			}
			
		}
		
		if(count>max1)
		{
			max1=count;
			a2=p[i];
		}
		
	}
	System.out.println(max1+" "+a2);
	
	
	
		
	}

}
