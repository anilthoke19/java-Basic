package wrapperClassP;

public class StringReverse {

	void rev()
	{
		String ss="anil thoke ambheri";
		char s[]=new char[ss.length()]; 
		for(int i=0;i<ss.length();i++)
		{
			s[i]=ss.charAt(i);
		}
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==' '||s[i]=='\0')
			{
				int count=i;
				for(int j=0;j<i/2;j++)
				{
					

					char temp= s[j];
					s[j]=s[count-1];
					s[count-1]=temp;
					count--;

				}
		
			}
		}
		System.out.println(s);

	}
	public static void main(String[] args) {
		StringReverse e=new StringReverse();
		e.rev();
	}
	
	
}
