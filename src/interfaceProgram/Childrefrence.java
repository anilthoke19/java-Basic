package interfaceProgram;

class Parent1
{
	Parent1()
	{
		System.out.println("constructor ");
		display();
	}
	void display()
	{
	System.out.println("parent");
	}
}

class Child1 extends Parent1
{
	void display()
	{
		//super.display();
		System.out.println("child-1");
	}
}

class Child2 extends Parent1
{
	void display()
	{
		System.out.println("child-2");
	}
}

public class Childrefrence {
public static void main(String[] args) {
//	Child1 p=new Child1();
//	p.display();
	Parent1 h=new Child2();
	h.display();
	
	
}

}
