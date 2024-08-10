
package objectClassMethod;


class NoteBook4
{
	int a;

	public NoteBook4(int a)
	{
		this.a=a;
	}
	
	void getValue()
	{
		System.out.println(a);
	}
	
	public boolean equals(Object obj)
	{
		NoteBook4 p=(NoteBook4)obj;
		if(this.a==p.a)
		{
			return true;
		}else 
		{
			return false;
		}
		
	}
	
	
}

public class ObjectCompare {
	public static void main(String[] args) {
		NoteBook4 n=new NoteBook4(10);
	    NoteBook4 n2=new NoteBook4(10);
	    
	 
	    if(n.equals(n2))
	    {
	    	System.out.println("object are same ");
	    }else
	    	System.out.println("objects are diff");
		
	}
	

}
