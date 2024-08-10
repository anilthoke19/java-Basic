 package constructorr;

class Vehical
{
	Vehical(int a,int b)
	{
		
		System.out.println("parent constructor"+a+b);
	}
	
}

class Car extends Vehical
{
	
	Car(int a,int b)
	{super(1,2);
		
		System.out.println("Car constructor"+a+b);
	}
	
}

class Bike extends Car
{
	
	Bike(int a,int b)
	{
		super(3,4);
		System.out.println("Bike constructor "+a+""+b);
	}
}

class Cycle extends Bike
{
	
 Cycle(int a,int b)
 {
	 super(5,6);
	 System.out.println("cycle consturctor"+a+" "+b);
 }
}



public class OverridChainingConstru {
	public static  void main(String[] ar)
	{
		Cycle c=new Cycle(7,8);
	}

}
