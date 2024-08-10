package interfaceProgram;

interface Animal2
{
	
	public static final int value=10;
	public abstract void display();
	public abstract void show();
}

interface Animal3
{
	public abstract void show();
}

class Cat implements Animal2,Animal3
{
	public void display()
	{
		System.out.println("1st method");
	}
	
	public void show()
	{
		System.out.println("2nd method");
	}
}





public class SimpleInter {
public static void main(String [] ah)
{

	Cat c=new Cat();
	c.display();
	c.show();
	
	
}

}
