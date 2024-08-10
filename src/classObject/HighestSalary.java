mysql> select distinct(price) from book2 e where 1-1=(select count(distinct(e1.price)) from book2 e1 where e.price>e1.price);

package classObject;

import java.util.Scanner;

class Emp
{
	int i,j,len,id,salary;
	String name;
	
	void add(Emp p[]) {
		
		Emp b=p[i]; // store first value for compare
		for(i=0;i<p.length;i++)
		{
			
			if(p[i].salary>b.salary)
			{
				b=p[i];
				
			}
		}
		System.out.println(b.name+" "+b.id+" "+b.salary);	
	}
}


public class HighestSalary {

	public static void main(String[] args) {
		
		Emp p[]=new Emp[4];
		int i,j,id,salary;
		String name;
		for(i=0;i<p.length;i++)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("entr name ,id and salary");
			p[i]=new Emp();
			p[i].name=s.nextLine();
			p[i].id=s.nextInt();
			p[i].salary=s.nextInt();
			
		}
		Emp g=new Emp();
		g.add(p);
	}
}
