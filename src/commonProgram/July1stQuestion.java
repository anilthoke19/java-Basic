package commonProgram;

class Employee
{
	String name;
	int id;
	float salary ,overTime;
	
	public Employee(String name,int id,float salary,float overTime)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.overTime=overTime;
		
	}
	
	public void informatio()
	{
		
		System.out.println("id: "+id+"\tname: "+name+"\salary: "+salary+"\tovertime: "+overTime);
	}

}

class OverTime
{
	String name;
	int id;
	float salary ,overTime;
	
	Employee emp[];
	
	
	void setEmployee(Employee emp[])
	{
		this.emp=emp;
	}
	
	public void  calculateOverTime()
	{
		
		for(int i=0;i<emp.length;i++)
		{
			
				System.out.println("name: "+emp[i].name+",\t over time hour is "+emp[i].overTime+", overtime is: "+emp[i].overTime*50);
			
		}
		
	}
	
	
	
}



public class July1stQuestion {
public static void main(String[] args) {
	
	OverTime o=new OverTime();

	Employee e[]=new Employee[5];
	
	 e[0]=new Employee("a", 1, 2, 3);
	 e[1]=new Employee("b", 11, 22, 33);
	 e[2]=new Employee("c", 01, 02, 03);
	 e[3]=new Employee("d", 101, 2, 3);
	 e[4]=new Employee("a", 1, 2, 3);
	 
for(int i=0;i<5;i++)
{
	e[i].informatio();
}
	System.out.println();
	o.setEmployee(e);
	o.calculateOverTime();
	
}
}
