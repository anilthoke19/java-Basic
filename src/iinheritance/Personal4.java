package iinheritance;

import java.util.Scanner;

class PersonalInfo{
	protected String name,lastName,MiddleName;
	
	PersonalInfo(String name,String lastName,String MiddleName)
	{
		this.name=name;
		this.lastName=lastName;
		this.MiddleName=MiddleName;
	}
	
}

 class ProfessionalInfo extends PersonalInfo
 {
	 int id,salary;
	 String des,skillSet;
	 

	ProfessionalInfo(int id,String des,int salary,String skillSet,String name) {
		
		super(name, "thoke", "ramrao");
		
		this.id=id;
		this.salary=salary;
		this.des=des;
		this.skillSet=skillSet;
		
	}
	void show()
	{
		System.out.println("first name: "+name+"\nmiddle name: "+MiddleName+"\nlast name: "+lastName);
		System.out.println("id: "+id+"\nsalary: "+salary+"\ndesignation: "+des+"\nskillset: "+skillSet);
		
	}
	 
	
 }


public class Personal4 {
	public static void main(String g[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter designation,skilset,id and salary ");
		String name=s.nextLine();
		String desi=s.nextLine();
		String skill=s.nextLine();
		int id=s.nextInt();
		int salary=s.nextInt();
		
		
		ProfessionalInfo p=new ProfessionalInfo(id, desi, salary, skill,name);
		p.show();
		
	}

}
