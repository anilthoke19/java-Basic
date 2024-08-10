package classInheritance;

abstract class Value{

int a,b;
void setValue(int x,int y) {
	a=x;
	b=y;
}



abstract void getResult();

	
}

class Add extends Value{
	
	
	void getResult()
	{
int sum=a+b;
System.out.println(sum);
		
	}
}

class Div extends Value{
	
	
	
	void getResult() {
		int divi=a/b;
		System.out.println(divi);
	}
}

class Mul extends Value{
	
	void getResult()
	{
		int mult=a*b;
		System.out.println(mult);
	}
}

class Calculation {
	void override(Value v)
	{
		v.getResult();
		
		
	}
}


public class DyanamicPolymorphism {
public static void main(String [] arg)
{
	Calculation c=new Calculation();
	
  Value a=new Add();
	a.setValue(10, 20);
	c.override(a);
	
	Value m=new Mul(); 
	m.setValue(10, 20);
	c.override(m);
	
	Value d=new Div();
	d.setValue(20, 10);
	c.override(d);
	
	
}
}
