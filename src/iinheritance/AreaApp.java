package iinheritance;

import java.util.Scanner;

class Area{
	protected float radius;
	protected int len;
	protected int wid;
	
	void setRadius(float radius)
	{
		this.radius=radius;
	}
	
	void setLengthWidth(int len,int wid)
	{
		this.len=len;
		this.wid=wid;
	}
	
}

class Circle extends Area
{
	
	float getCircleArea()
	{float area;
	area=2*3.14f*radius*radius;
	return area;
		
		
	}
}

class Rectangle extends Area {
	
	int getRectArea()
	{
		
		int area=len*wid;
		return area;
	}
	
}


public class AreaApp {
	public static void main(String h[] )
	{
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		int len,wid;
		float rad;
		Scanner s=new Scanner(System.in);
		System.out.println("enter length ,width and radius");
		len=s.nextInt();
		wid=s.nextInt();
		rad=s.nextFloat();
		
		c.setRadius(rad);;
		float area=c.getCircleArea();
		System.out.println("area if circle is  "+area);
		
		r.setLengthWidth(len, wid);
		int are=r.getRectArea();
		System.out.println("area of rectangle is "+are);
		
		
		
		
	}

}
