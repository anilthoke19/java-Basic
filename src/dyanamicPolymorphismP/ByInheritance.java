package dyanamicPolymorphismP;

abstract class Value
{
	int a,b;
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	abstract int getResult();
}

class Add extends Value
{
int ad;	
	int getResult()
	{
	
		ad=a+b;
		return ad;
	}
}

class Sub extends Value
{
	int sb;
	int getResult()
	{
		sb=a-b;
		return sb;
	}
}

class Mul extends Value
{
	int getResult()
	{
		int mt;
		mt=a*b;
		return mt;
	}
}

class Calculator 
{
	void dyanamicc(Add v)
	{
		int result=v.getResult();
		System.out.println(result);
	}
	
	void dyanamicc(Mul m)
	{
		int result=m.getResult();
		System.out.println(result);
	}
	
	void dyanamicc(Sub s)
	{
		int result=s.getResult();
		System.out.println(result);
	}
	
	
}


public class ByInheritance {
	public static void main(String[] ag) {
		Calculator c =new Calculator();
		Add v=new Add();
		v.setValue(10, 20);
		c.dyanamicc(v);
		
		Sub v1=new Sub();
		v1.setValue(20, 10);
		c.dyanamicc(v1);
		
		Mul v2=new Mul();
		v2.setValue(5, 5);
		c.dyanamicc(v2);
		
		
		
	}
}
