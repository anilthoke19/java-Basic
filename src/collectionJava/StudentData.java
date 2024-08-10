package collectionJava;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentData {
	
	
	private int id;
private String name;
private int fees;
private String city;
private float percent;

public void setId(int id)
{
	this.id=id;
}

public int getId()
{
	return id;
}

public void setName(String name)
{
	this.name=name;
}
public String getName() {
	return name;
}

public void setFees(int fees)
{
	this.fees=fees;
}
public int getFees()
{
	return fees;
}

public void setCity(String city) {
	this.city=city;
}
public String getCity()
{
	return city;
}

public void setPer(float per)
{
	percent=per;
}
public float getPer()
{
	return percent;
}
    
public StudentData()
{
	
}

public StudentData(int id,String name,int fees,String city,float per) {
	this.id=id;
	this.name=name;
	this.fees=fees;
	this.city=city;
	this.percent=per;
}

public static void main(String[] hd)
{
	do {
		int choice=1;
		System.out.println("1: add class object in arrayList");
		System.out.println("2: Display all object in arrayList");
		System.out.println("3: Remove student from arrayList using id");
		System.out.println("4: Search  student from arrayList using id");
		System.out.println("5: Update  student from arrayList using id");
		ArrayList ar=new ArrayList();

		switch(choice)
		{
		case 1:

			//Scanner sc=new Scanner (System.in);
			
			int id,fees;
			String name,city;
			float per;
			
			for(int i=0;i<2;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id,name,fees,city,percentage");
			id=sc.nextInt();
			sc.nextLine();
			name=sc.nextLine();
			fees=sc.nextInt();
			sc.nextLine();
			city=sc.nextLine();	
			per=sc.nextFloat();	
			StudentData s=new StudentData(id,name,fees,city,per);
		     ar.add(s);
			
			}
			break;
			
		case 2:
			
			for(Object obj:ar) // display logic 
			{
				StudentData d=(StudentData) obj;
				System.out.println(d.getCity()+d.getId());
			}
			break;
			
			case 3:
				Scanner sc=new Scanner(System.in); // remove logic
				System.out.println("enter the id");
				int idd=sc.nextInt();
				for(int i=0;i<ar.size();i++)
				{
					if((int)ar.get(i)==idd)
					{
						ar.remove(i);
				System.out.println("index removed"+i);
					}
					
				}
				break;
			case 4:
				// search logic 
				Scanner ssc=new Scanner(System.in); 

				boolean flag=false;
				int i;
				System.out.println("enter id for search ");
				int value=ssc.nextInt();
				for(Object obj:ar) {
					
					StudentData d=(StudentData)obj;
					if(value==d.getId())
					{
						System.out.println(d.getName()+" "+d.getFees()+" "+d.getId()); 
					}
				}
				break;
				
			case 5:
				// Update logic 
				Scanner scc=new Scanner(System.in); 

				int index;
				System.out.println("enter update index number");
				index=scc.nextInt();
				
				for(Object obj:ar) {
					StudentData d=(StudentData)obj;
				if(index==d.getId())
				{
			d.setName("anil");
			d.setFees(3238);;
				}
				}
				
				
				for(Object obj:ar)
				{
					StudentData d=(StudentData)obj;
					System.out.println(d.getFees()+" " +d.getName());
				}
				break;
				
				default:
					System.out.println("ENTER CORRECT OPTION");
		}


	}while(true);
	
	
	
}

}
