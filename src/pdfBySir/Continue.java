package pdfBySir;


class Book {
	
	void add()
	{
	System.out.println("Book logic ");	
	}
}

class Note extends Book
{
	 protected  void add() {
		System.out.println("note logic");
	}
}

class Pen extends Note
{
	
	static class Inner{
		
		void show()
		{
			System.out.println("iner class metod");
		}
	}
	
	public void add()
	{
	System.out.println("Pen logic");	
	}
}

class Dyanami 
{
	
	public void addObject(Book obj)
	{
		//Note p=(Note)obj;
		obj.add();
		
	}
}

public class Continue {
	public static void main(String[] args) {
		Dyanami d=new Dyanami();
		
		Pen p=new Pen();
		Note n=new Note();
		d.addObject(p);
		d.addObject(n);
		
		Pen.Inner i=new Pen.Inner();
		i.show();
		
		
	}

}
