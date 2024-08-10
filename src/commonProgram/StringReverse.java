package commonProgram;



class Rever
{
	String name;
	
	void add(String name)
	{
		this.name=name;
	}
	void show()
	{
		int i;
		String f=" ";
		
		for(i=0;i<name.length();i++)
		{
		f=name.charAt(i)+f;	
		}
		
		
		
		System.out.println(f);
	}
}
public class StringReverse {
	public static void main(String [] r)
	{
		
		Rever e=new Rever();
		e.add("anil thoke hingoli");
		e.show();
		
	}

}
