package interfaceProgram;

interface Animal
{
	
	void display();
}

interface Animall
{
	
	void display();
}

abstract class CatAnimal
{
	static void add()
	{
		
	}
	static void show()
	{
		System.out.println("Cat class method");
	}
}
class Birds extends CatAnimal  implements Animal,Animall
{

	public void display()
	{
		System.out.println("parent class override");
	}
	
	
}




public class MultipleInterface {
	public static void main(String[] f)
	{
		Birds b=new Birds();
		b.display();
		b.show();
		
	}

}
