package iinheritance;

import java.util.Scanner;

class Value{
	int a,b;
	
	void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}

class Add extends Value{
	int add;
	public int getAdd()
	{
		 return add=a+b;
	}
	
}

class Div extends Value
{
	int div;
	
	int getSub()
	{
		div=a-b;
		return div;
	}

}

class Mul extends Value
{
	int getMul()
	{
		int mul=a*b;
		return mul;
	}
}



public class ValueMain {
	public static void main(String []q)
	{
		int no1,no2;
		Scanner s=new Scanner(System.in);
		System.out.println("ente the two number");
		no1=s.nextInt();
		no2=s.nextInt();
		Add a=new Add();
		a.setValue(no1, no2);
		int add=a.getAdd();
		System.out.println("addition is:"+add);
		
		Mul m=new Mul();
		m.setValue(no1, no2);
		int mul=m.getMul();
		System.out.println("multiplication  is:"+mul);

		
		Div d=new Div();
		d.setValue(no1,no2);
		int div=d.getSub();
		System.out.println("division  is:"+div);

		
		
		
	}

}
