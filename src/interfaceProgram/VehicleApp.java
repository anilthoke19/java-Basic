package interfaceProgram;

interface Vehicle
{
	public  final int id=10,price=20000;
	public final String company="tata";
	
	public abstract void display();
	
}


class Bus implements Vehicle
{
	
	public  void display()
	{
	System.out.println(id+" "+company+" " +price);
		
	}
}


public class VehicleApp {
	public static void main(String[] args) {
		
		Bus b=new Bus();
		b.display();
	}

}
