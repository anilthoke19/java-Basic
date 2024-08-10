package classObject;

public class DemoObj {
	
	
	public static void main(String[] args) {
		Object ob[]=new Object[2];
		
		ob[0]=new Object();
		ob[0]=12;
		//ob[1]=988;
		
		ob[1]=new Object();
		ob[1]=100;
	
		
		
		for(Object oj:ob)
		{
			System.out.println(oj);
		}
		
	}
	
	

}
