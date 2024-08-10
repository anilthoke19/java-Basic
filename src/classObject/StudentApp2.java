package classObject;

import java.util.Scanner;

class Student
{
	static int va=100;
int id,num;
String name;

}

class StudentData{
Student t[];
void add(Student t[])
{
	this.t=t;
}

void displaySort()
{
	int i,j,index;
	for(i=0;i<t.length;i++)
	{
		
		for(j=i;j<t.length;j++)
		{
		if(t[i].id> t[j].id)
		{
			Student d=t[i];
			t[i]=t[j];
			t[j]=d;
			
		}
			
			
	}
	}
	
	for(i=0;i<t.length;i++)
	{
		System.out.println(t[i].id+t[i].name+t[i].num);

	}
	
}
	
}

public class StudentApp2 {
public static void main(String [] ar)
{
	int id ,num,i;
	String name;
	Student t[]=new Student[4];
	
	
	
	for(i=0;i<t.length;i++)
	{
		Scanner s=new Scanner(System.in);

	System.out.println("enter the name ,id and number ");
	name=s.nextLine();
	id=s.nextInt();
	num=s.nextInt();
	t[i]=new Student();
	t[i].name=name;
	t[i].id=id;
	t[i].num=num;
	
	}
	
	StudentData d=new StudentData();
	t[1].va=10;
	d.add(t);
	d.displaySort();
	
}
	
}
