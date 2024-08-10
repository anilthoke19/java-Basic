package featuresJava1_8;
@FunctionalInterface

interface Square
{
	public int squareAdd(int no);
	
}

public class FunctionalInterfaecEx {
	public static void main(String[] args) {
	
		
		// .................Functional interface ..................... 
	/*	Square a=new Square()
				{
			public void  squareAdd(int no)
			{
				int pro=no*no;
				System.out.println(pro);
			}
					};
		a.squareAdd(10);
		*/
		
	//.................	 by lambada .................
		
/*		Square aa=(int no)->
		{
			
			int pro=no*no;
			return pro;
			
		};
		
	System.out.println(aa.squareAdd(20));	
	*/
	
		
		
	//................... by lamabada in short 	
	
		/*
	 Square aa=(int no)-> no*no;
	 
	 int result=aa.squareAdd(10);
	 System.out.println(result);
		
		*/
		
		
		
 //.......... lamabada call ,and functionality at once
		
	  System.out.println(((Square)(int no)->(no*no)).squareAdd(10));
		
		
		
		
	}

}
