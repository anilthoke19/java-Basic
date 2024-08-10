package collectionJava;


import java.util.*;

class DemoCar
{
	int id;
	String name;
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
	public DemoCar(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public DemoCar() {
		
	}
	
	
	
	
}




public class SortUserDataCollection {
	public static void main(String[] args) {
	ArrayList< DemoCar> ar=new ArrayList<DemoCar>();
	
		DemoCar d[]=new DemoCar[5];
		
		d[0]=new DemoCar(11,"Tata");
		ar.add(d[0]);
		d[1]=new DemoCar(2,"BAJAJ");
		ar.add(d[1]);
		d[2]=new DemoCar(33,"MAHINDRA");
		ar.add(d[2]);
		d[3]=new DemoCar(4,"VOLVO");
		ar.add(d[3]);
		d[4]=new DemoCar(5,"ASHOK LEY");
		ar.add(d[4]);
	int choice;
	
		
	do {
		
		System.out.println("1: delete car object by name ");
		System.out.println("2: delete car by id");
		System.out.println("3: sort car by price");
		System.out.println("4: update car price by name");
		System.out.println("5: view all data ");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1:
			System.out.println("Enter car name for delete data ");
			sc.nextLine();
			String name=sc.nextLine();
				for(int i=0;i<ar.size();i++)
				{
					DemoCar c=ar.get(i);
					
					if(c.getName().equalsIgnoreCase(name))
					{
						ar.remove(i);
						System.out.println("deleted");
						break;
					}
					 
					
				}
			
			 break;
			 
		case 2:
			
			TreeSet<DemoCar> a=new TreeSet();
			
			a.add(d[0]);
			a.add(d[1]);
			a.add(d[2]);
			
			
			
			for(DemoCar dc:a)
			{
				System.out.println(dc.getId());
			}
			
			
//			System.out.println("Enter car id for delete data ");
//			sc.nextLine();
//			int id=sc.nextInt();
//				for(int i=0;i<ar.size();i++)
//				{
//					DemoCar c=ar.get(i);
//					
//					if(c.getId()==id)
//					{
//						ar.remove(i);
//						System.out.println("deleted");
//						break;
//					}
//				}
			break;
			
		case 3:
			
			for(int i=0;i<ar.size();i++)
			{
		
				for(int j=i;j<ar.size();j++)
				{
					DemoCar d4=ar.get(i);
					DemoCar d5=ar.get(j);
			if(d4.getId()<d5.getId())
			{
				DemoCar d6=ar.get(i);
			ar.set(i, d5);
			ar.set(j, d6);
			
		
				
			}
					
					
				}
			}
			
			
			
			break;
			
		case 4:
			
			 break;
			 
		case 5:
			for(DemoCar ad:ar)
			{
				System.out.println(ad.getId()+" "+ad.getName());
			}
			break;
			 
			 default:
				 System.out.println("choose correct option ");
		}
		
	
		
	}while(choice<6);
		
		
		
	

		
	}

}
