package collectionJava;

import java.util.*;

class Emp3
{
	int id,salary;
	String name;
//	public Emp(int id, int salary, String name) {
//		
//		this.id = id;
//		this.salary = salary;
//		this.name = name;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
	
}

public class ArrayListOperationn  {
	public static void main(String[] args)throws InterruptedException {
		int choice,salary,id;
		String name;
		Scanner sc=new Scanner(System.in);
		ArrayList <Emp3> a=new ArrayList<Emp3>();
		
		do {
		System.out.println("1:enter employee info");
		System.out.println("2:view employee info");
		System.out.println("3:delete emp from arraylist");
		System.out.println("4:Update emp salary");
		System.out.println("5:search  employee info");
		
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice)
		{
		
		case 1:
			System.out.println("Enter id ,name and salary of employee");
			sc.nextLine();

			name=sc.nextLine();


			id=sc.nextInt();
			salary=sc.nextInt();

			//sc.next();

			

			

			
			Emp3 p=new Emp3();
			p.setId(id);
			p.setName(name);
			p.setSalary(salary);
			
			a.add(p);
			break;
			
		case 2:
			
			ListIterator<Emp3> i=a.listIterator(a.size());
			
			while(i.hasPrevious())
			{
				
				Emp3 k=i.previous();
				System.out.println(k.id+" "+ k.name+" "+k.salary);
				
			}
			
			
			
			
//			Iterator<Emp3> i=a.iterator();
//			
//			while(i.hasNext())
//			{
//				
//				Emp3 k=i.next();
//				System.out.println(k.id+" "+k.name+" "+k.salary);
//				
//			}
			break;
			
		case 3:
			
			System.out.println("Enter employee id for delete");
			id=sc.nextInt();
			for(int j=0;j<a.size();j++)
			{
			Emp3 k=a.get(j);
			
			if(k.id==id)
			{
				a.remove(j);
			}

				
			}
			
			
			break;
			
		case 4:
			Scanner scc=new Scanner(System.in);
			System.out.println("Enter name for update new name ");
			name=scc.nextLine();
			
			for(int j=0;j<a.size();j++)
			{
				
				Emp3 k=a.get(j);
				
				if(k.getName().equalsIgnoreCase(name))
				{
					System.out.println("Enter new name");
					name=scc.next();
					k.setName(name);
					System.out.println("name updated ");
					break;
				}
				
			}
			
			break;
			
		case 5:
			System.out.println("Enter id for search");
			id=sc.nextInt();
			Iterator <Emp3> m=a.iterator();
			int flag=0;
			while(m.hasNext())
			{
				Emp3 k=m.next();
				
				if(k.getId()==id)
				{
					flag=1;
					break;
				
				}
			}
			if(flag==1)
			{
				System.out.println("Employee found");
				

			}else
			{
				System.out.println("User not found");
			}
			
			break;
			
			default:
				System.out.println("Enter correct choice");
		
		
		}

		
		


		
			
			
		}while(choice<7);
		
		
		
		
		
		
	}

}
