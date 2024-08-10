package commonProgram;

import java.util.Scanner;

class Car
{
	int a[];
	String name;
	void add(String name,int...a)
	{
	
		this.a=a;
		this.name=name;
	}
	
	void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println(name);
	}
}



public class VariableArgs {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the aray element");
		Car a=new Car();
		a.add("anil",new int[] {1,2,3,4,5,6,7});
		a.display();
		
		
	}

}
