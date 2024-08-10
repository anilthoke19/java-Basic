package objectClassMethod;

class NoteBook
{
	int a;

	NoteBook(int a)
	{
		this.a=a;
	}
	
	void getValue()
	{
		System.out.println(a);
	}
	
	public boolean equals(Object obj)
	{
		NoteBook p=(NoteBook)obj;
		if(this.a==p.a)
		{
			return true;
		}else 
		{
			return false;
		}
		
	}
	
	
}

public class ObjectEqualCheck {
	public static void main(String[] args) {
		NoteBook n=new NoteBook(10);
	    NoteBook n2=new NoteBook(10);
	    
	 
	    if(n.equals(n2))
	    {
	    	System.out.println("object are same ");
	    }else
	    	System.out.println("objects are diff");
		
	}
	

}
