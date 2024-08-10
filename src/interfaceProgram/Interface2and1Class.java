package interfaceProgram;
import java.util.*;
interface Cable
{
	public abstract void show();
}

interface Alm extends Cable
{
	
	public abstract void display();
}

abstract class CableAlm implements Alm
{

public abstract void display(); 
	public void show() {
		// TODO Auto-generated method stub
		
	}
	void add()
	{
		System.out.println();
	}
	
	ArrayList al=new ArrayList();


	
}




public class Interface2and1Class {

}
