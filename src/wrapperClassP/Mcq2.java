package wrapperClassP;

public class Mcq2 {

	public static void main(String s[])
	{ String str1 = "abc";
	String str5="abc";
	 String str2 = new String (str1);
	 String str3 = new String ("abc");
	 String str4 = new String ("abc");
	 System.out.println((str1 == str3) + " ");
	 System.out.println(str4.equalsIgnoreCase(str1) + " ");
	 System.out.println((str2 == str3) + " ");
	 System.out.println(str3.equals(str4));
	 System.out.println(str1==str5);
	 System.out.println(str3==str4);
	 }
	}


