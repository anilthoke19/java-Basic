package wrapperClassP;

public class SwitchTest_mcq5 {

	 public static void main(String args[]) {
		 String str;
		 String s;
		 String s1 = new String("i");
		 String s2 = new String("j");
		 String s3 = new String("k");
		 str = s2;
		 s2 = null;//1
		 str = s1 + s2 + s3;//2
		 System.out.println(str);

		 s1 = null;//3
		 System.out.println(s1);
		 str = null;//4
		 s3 = null;//6
		 System.out.println(s3);
		 System.out.println(str);
		 
		 String str11 = null;
		 System.out.println(str11.valueOf("aninl"));
		 
		 String ss = new String("5");
		 System.out.println(1 + 10 + ss + 1 + 10);//left to right 
		 


		} 
	
	
}
