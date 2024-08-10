package objectClassMethod;

public class ObjectCloneApp {
public static void main(String[] args) throws Exception {
		
	Book b=new Book();
	Book b2=b.clonemethod();

	b.setVale(1000);
          	b2.setVale(10);
		b.getValue();
	
	}

}




class Book implements Cloneable
{
	int no;
	void setVale(int no)
	{
		this.no=no;
	}
	
	public Book clonemethod( ) throws Exception
	{
		Object obj=this.clone();
		return (Book)obj;
		
	}
	
	void getValue()
	{
		System.out.println(no);
	}
	
}


