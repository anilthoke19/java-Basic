package collectionJava;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
	private int id,contact;
	private String name,email,address;
	
	int i,value;
	
	public PhoneBook() {
		
	}
	
	public PhoneBook (int id,String name,int contact,String email,String address)
	{
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.email=email;
		this. address=address;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	public static void main(String[] afd)
	{
		Scanner sc=new Scanner(System.in);

		
		ArrayList ar=new ArrayList();

		int id;
		int contact;
		int i,count;
		 String name,email,address;
			int no1=0,no2=0,no3=0,no4=0,no5=0,no6=0;

		
		 do {
			 System.out.println("1: Create new contact");
			 System.out.println("2: view contact  ");
			 System.out.println("3: search contact by id");
			 System.out.println("4: delete contact by id ");
			 System.out.println("5: count the contact whose name same ");
			 System.out.println("6: count the contact start with 90,91,97,95,86,87");
			 System.out.println("7: count contact whose addres pune &Nashik");
			 System.out.println("8: update the contact info by Id");
			 int choice;
			 System.out.println("enter choice:");
			 choice =sc.nextInt();
			 
			 switch(choice)
			 {
			 case 1:
				 System.out.println("enter id,name,contact,email,address ");
					id=sc.nextInt();
					sc.nextLine();
					name=sc.nextLine();
					contact=sc.nextInt();
					sc.nextLine();
					email=sc.nextLine();
					address=sc.nextLine();
					
					
					PhoneBook p=new PhoneBook(id,name,contact,email,address);
					
					ar.add(p);
				 break;
				 
				 
			 case 2:
				 for(Object obj:ar)
					{
					 PhoneBook k=(PhoneBook)obj;
						System.out.println(k.getName()+" "+k.getEmail());
					}
				 break;
				 
				 
			 case 3:
				 // search by id
				 System.out.println("enter id for search ");
					int idd=sc.nextInt();
					boolean flag=false;
					for(Object obj:ar)
					{
						PhoneBook k=(PhoneBook)obj;
						
						if(idd==k.getId())
						{
					System.out.println(k.getId()+" "+k.getName()+" "+k.getEmail());

				  		}
					}
					if(flag==false)
					{
					System.out.println("user not found");
					}
					
				 break;
			 case 4:
				 
				//delete contact 
				 System.out.println("enter id for delete contact");
					idd=sc.nextInt();
					//sc.nextLine();
					for(Object obj:ar)
					{
 
						PhoneBook b=(PhoneBook)obj;
						
						 
					for(int j=0;j<ar.size();j++) {
						if(idd==b.getId())
						{
							ar.remove(obj);
						}
					}
					}
				 break;
			 case 5:
				 
			 {
				count=1;
//				Scanner cc=new Scanner(System.in);
//					System.out.println("enter the name for repeated count");
//					String sname=cc.nextLine();
//					for(Object obj:ar)
//					{
//					
//						PhoneBook k=(PhoneBook)obj;
//						
//						if(sname.equals(k.getName()))
//						{
//							count++;
//						}
//					}
//					System.out.println(sname+"present in the list for "+count+"times");
				for(i=0;i<ar.size();i++)
				{
					PhoneBook b1=null;
					PhoneBook b2=null;
					for(int j=i+1;j<ar.size();j++)
					{
						 Object obj1=ar.get(i);
						 Object obj2=ar.get(j);
						  b1=(PhoneBook)obj1;
						  b2=(PhoneBook)obj2;
						 if(b1.getName().equalsIgnoreCase(b2.getName()))
						 {
							 count++;
							 //System.out.println(b2.getName());
						 }	 
					}
					if(b1!=null&& b2!=null&&count>0) {
					System.out.println("count is "+count+":  "+b2.getName());}
					count=0;
					
				}
				
				
					}
					
				 break;
			 case 6:			
					// count the contact with 90,91,97,95,86,87

							for(Object obj:ar)
							{
								PhoneBook k=(PhoneBook)obj;
								int choice1=k.getContact();
								System.out.println("your output"+k.getContact());
								switch(choice1)
								{
								case 90:
									no1++;
								break;
								
								case 91:
									no2++;
									break;
									
								case 97:
									no3++;
									break;
									
								case 95:
									no4++;
									break;
									
								case 86:
									no5++;
									break;
									
								case 87:
									no6++;
									break;
								default:
									System.out.println("No contact match");
								}
				System.out.println("90: "+no1+"\n91: "+no2+"\n97: "+no3+"\n95: "+no4+"\n86: "+no5+"\n87: "+no6);
								
							}
						
				 break;
				 
				 
			 case 7:
				 // address count NASHIK and PUNE
				 int count1=0;
				 for(Object obj:ar)
				 {
					 PhoneBook k=(PhoneBook)obj;
					 if(k.getAddress().equalsIgnoreCase("pune")||k.getAddress().equalsIgnoreCase("nashik"))
					 {
						 count1++;
					 }
				 }
				 System.out.println("pune and nashik number  have "+count1+"\n");
				 
				 break;
				 
				 
			 case 8:
				 System.out.println("enter id for update ");
				 Scanner scc=new Scanner(System.in);
				idd=scc.nextInt();
				 for(Object obj:ar)
				 {
					 PhoneBook k=(PhoneBook)obj;
					 if(idd==k.getId())
					 {
						 
						 k.setName("anil");
						k.setAddress("hingoli");
						k.setContact(00001);
						
						
					 }
				 }
				 
				 
				
				 break;
			 
			 }
		 }while(true);			
			
			
	}
}
