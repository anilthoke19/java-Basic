package iinheritance;

class Car {
	
	public void show()
	{
		System.out.println("It is parent method");
	}
}

class Mahindra extends Car
{
	public void show()
	{
		System.out.println("It chid class method");
	}
	
	public void par()
	{
		super.show();
	}
	
}



public class ParentMethod {
	public static void main(String[] args) {
		
		Mahindra m=new Mahindra();
		m.par();
		
	}

}
