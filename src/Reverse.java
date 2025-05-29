
public class Reverse {
	public static void main(String[] args) {
		
		String a= " ekoht lina ",nstr="";
		int len=a.length();
		
		for(int i=0;i<len;i++)
		{
			char ch=a.charAt(i);
			nstr=ch+nstr;
			
		}
		System.out.println(nstr);

		//here we can use StringBuffer or StringBuilder and use reverse() method
		
		
	}

}
