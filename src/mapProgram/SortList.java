package mapProgram;
import java.util.*;
public class SortList {
public static void main(String[] args) {
	
	ArrayList ar=new ArrayList();
	ar.add(10);
	ar.add(20);
	ar.add(49);
	ar.add(5);
	ar.add(90);
	ar.add(40);
	ar.add(10);
	ar.add(90);
	
	 for(int i=0;i<ar.size();i++)
	 {
		 for(int j=i+1;j<ar.size();j++)
		 {
			 Object obj=ar.get(i);
			 Object objj=ar.get(j);
			 int a=(Integer)obj;
			 int b=(Integer)objj;
			 if(a>b) {
			 ar.set(i, objj);
			 ar.set(j, obj);
			 }
		 }
	 }
	 
	 int c,d;
	int j;
	Object t;
		 int count=1;
		 for( j=0;j<ar.size()-1;j++)
		 {
			
			if(ar.get(j)==ar.get(j+1))
			{
				count++;
			}else
			{
				Object ob=ar.get(j);
				System.out.println(ob+" "+count);
				count=1;
			}	 
	 }t=ar.get(j);
		System.out.println(t+" "+" "+count); 
	 
//	 
//	 for(Object obj:ar)
//	 {
//		 System.out.println(obj);
//	 }
	
	
}
}
