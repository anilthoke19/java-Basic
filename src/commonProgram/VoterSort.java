package commonProgram;

import java.util.Scanner;

class Student{
private int id;
private String name;
float salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
}


class Demo{


Student t[];


void  add(Student a[])
{
	t=a;

}

Student show(int j)
{
	if(t[j].getId()>4)
	return t[j];
	else 
		return null;
	
}


}


public class VoterSort {

	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of emolyee");
	int size=s.nextInt();
		Student t[]=new Student[size];
		s.nextLine();
	
		
		System.out.println("enter id name and salary of 3 emp");
		for(int i=0;i<size;i++)
		{
			t[i]=new Student();
			String name=s.nextLine();
			int id=s.nextInt();
			float salary=s.nextFloat();
			t[i].setName(name);
			t[i].setId(id);
			t[i].setSalary(salary);
			s.nextLine();
		}
		
		Demo d=new Demo();
		d.add(t);
		for(int a=0;a<t.length;a++) {
		Student h=d.show(a);
		if(h!=null)
		
		System.out.println(h.getId()+h.getName()+h.getSalary());
		}
	
	}	
}

