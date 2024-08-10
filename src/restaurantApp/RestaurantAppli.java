package restaurantApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale.Category;
import java.util.Scanner;


public class RestaurantAppli {
	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ArrayList ar2 = new ArrayList();
		ArrayList ar3 = new ArrayList();// for Manager details
		ArrayList ar4 = new ArrayList();// for user details

		


		Customer c = new Customer();
		Manager m = new Manager();
		Food f = new Food();
		Food k = new Food();

		String name,category, pass;
		int choice,price,flag=0,sum=0,aa;
		String n,foo,g,username,password,division;
		
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Login \n 1: Customer\n 2: Manager\n 3: REGISTER");
			System.out.println("enter choice");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("\nenter username and password");
				sc.nextLine();
				name = sc.nextLine();
				pass = sc.nextLine();

				for(Object objj:ar4) {
					c=(Customer)objj;
				if (c.getPassWord().equalsIgnoreCase(pass) && c.getUserName().equalsIgnoreCase(name)) {
					do { // costomer function

						System.out.println("1: Display all food items");
						System.out.println("2: Purchase food items");
						System.out.println("3: Display total bills");
						System.out.println("4: search food items by price range");
						System.out.println("5: search food items by catogory");

						System.out.println("\nenter choice ");
						choice = sc.nextInt();

						switch (choice) {
						case 1:
							for(Object obj:ar)
							{
								 f=(Food)obj;
								 System.out.println(f.getName()+f.getCat()+f.getPrice());
							}
							break;
							
							// purchase food items
						case 2:
							 sum=0;
//							
                            System.out.println("your food Items are :");
							for(Object obk:ar)
							{
								Scanner scc=new Scanner(System.in);
								//sc.nextLine();
								
								

								f=(Food)obk;
								System.out.println("\nEnter the  food name you want  ");
								name=scc.nextLine();
								
								if(f.getName().equalsIgnoreCase(name))
								{
									System.out.println(f.getCat()+" "+f.getName()+" "+f.getPrice()+"\n");
									 sum=f.getPrice()+sum;
									 ar2.add(f); // for selling details to manager
								}
								else {
									System.out.println("\nThank you ! ");
									break;
								}
								
							}

							break;
							
							
						case 3:
							// billing 
							
                            System.out.println("\nYour bill is: "+sum);
							break;
							
							// sorting by price
							
 case 4:    
for(int i=0;i<ar.size();i++)
{
	for(int j=i+1;j<ar.size();j++)
	{
		Object obj1=ar.get(i);
		Object obj2=ar.get(j);
		Food a=(Food)obj1;
		Food b=(Food)obj2;
		if(a.getPrice()>b.getPrice())
		{
			ar.set(i, b);
			ar.set(j, a);
		}
		
	}
	
}
System.out.println("enter minimum the price");
price=sc.nextInt();
System.out.println("enter maximum the price");
int price2=sc.nextInt();
for(Object obj:ar)
{
	f=(Food)obj;
	if(f.getPrice()>=price&&f.getPrice()<=price2) {
	System.out.println(f.getCat()+" "+f.getName()+" "+f.getPrice());
	}else 
	{
		flag=1;
	}
}

//	if(flag==1) {
//		System.out.println("food not in these price");
//	}
        break;
							
							
	case 5:
		Scanner scc=new Scanner(System.in);
System.out.println("\nenter the food category");
category=scc.nextLine();
		for(Object obj:ar)
		{
			f=(Food)obj;
			
			if(f.getCat().equalsIgnoreCase(category))
			{
				System.out.println(f.getName()+" "+ f.getPrice());
			}
			
		}
		
		break;
							
							
						
						}
						//break;
					} while (choice!=9);// custome functionn

				}
			}
				// here loop 
				break;

			// for manager case
			case 2:

				System.out.println("\nenter username and password");
				sc.nextLine();
				name = sc.nextLine();
				pass = sc.nextLine();

				for(Object obj3:ar3) {
					m=(Manager)obj3;
				
				if (m.getPassWord().equalsIgnoreCase(pass)&& m.getUserName().equalsIgnoreCase(name)) {

					do {
						System.out.println("1: add food items");
						System.out.println("2: display all food ");
						System.out.println("3: update food item");
						System.out.println("4: delete food item");
						System.out.println("5: displAY total sales");
						System.out.println("6: display all customer details ");
						System.out.println("ENTER 9 FOR LOGIN PAGE");

						System.out.println("\nenter the choice");
						choice = sc.nextInt();

						switch (choice) {
						case 1: // ADD FOOD ITEMS

							System.out.println("enter food name,food catogery and food price  ");
							Food fk=new Food();
							name=sc.next();
							category=sc.next();
							//sc.nextLine();
							price=sc.nextInt();
							fk.setName(name);
							fk.setCat(category);
							fk.setPrice(price);
						   // Food f2=new Food(name,category,price);
							boolean b=ar.add(fk);
							if(b)
							System.out.println("add successfully");
							else
								System.out.println("food not save");
							
							break;

						case 2: // DIsPLAY ALL FOOD 
							
							 for(Object obj:ar)
						     {
						    	Food f1=(Food)obj;
						    	 System.out.println(f1.getName()+" "+f1.getPrice()+" "+f1.getCat());
						     }
							
	                              break;
	                              
						case 3:    // UPDATE FOOD
							Scanner scc=new Scanner(System.in);
							System.out.println("enter food name for update menu");
							name=scc.nextLine();
						for(Object obj:ar)
						{
							f=(Food)obj;
							if(f.getName().equalsIgnoreCase(name))
							{sc.nextLine();
								System.out.println("enter food category,food name and food price");
								category=sc.nextLine();
								name=sc.nextLine();
								
								price=sc.nextInt();
								f.setName(name);
								f.setCat(category);
								f.setPrice(price);
								
							}
						}
						break;
						
						case 4: // DELETE FOOD
							sc.nextLine();
							System.out.println("enter the food name for delete food item");
							name=sc.nextLine();
							
							for(Object obj:ar)
							{
								f=(Food)obj;
								if(f.getName().equalsIgnoreCase(name))
								{
									 
								int index=ar.indexOf(f);
								if(index!=0){
								ar.remove(index);
								//System.out.println("Cart removed\n");
								flag=1;
								break;
								}
								}
							}
								if(flag==1) {
									System.out.println("item removed\n");
								}
								
								else
								{
									System.out.println("food item not available\n");
								}
							
								
								
							
							break;
							
						case 5: // total sales
							int size;
							size=ar2.size();
							System.out.println("total size is: "+size);
							for(Object obj:ar2)
							{
								//System.out.println(ar2);
								
								f=(Food)obj;
								
								System.out.println(f.getCat()+" " +f.getName()+" "+f.getPrice());
							}
							
							break;
							
							
							// ALL CUSTOMER DETAILS
						case 6:
							System.out.println("CUSTOMER DETAILS");
							for(Object obj:ar4)
							{
								c=(Customer)obj;
								System.out.println(c.getName()+" "+c.getfFood()+" "+c.getGender()+" "+c.getAge());
							}
							break;
					
						}
					
							

					} while (choice!=9);

				}
				else
				{
					
					System.out.println("Manager detail not found .please Register first !");
					break;
				}
				
				
				}
				
	
				break; // manager case end
		
			case 3:
			int choice3;
			System.out.println("1: Customer Registor \n 2: Manager Registor");
			choice3=sc.nextInt();
				switch(choice3) {
				case 1:
					
					System.out.println("enter age,name , food,gender,username and password\n");
					aa=sc.nextInt();
					sc.nextLine();
					n=sc.nextLine();
					foo=sc.nextLine();
					g=sc.nextLine();
					username=sc.nextLine();
					password=sc.nextLine();
					
					
					 
					 Customer cc=new Customer();
					 cc.setName(n);
					 cc.setfFood(foo);
					 cc.setGender(g);
					 cc.setAge(aa);
					cc.setUserName(username);
					 cc.setPassWord(password);
					 
					
					 ar4.add(cc);
					break;
					
				case 2:
					System.out.println("\nenter name ,division,username and password");
					sc.nextLine();
					name=sc.nextLine();
					division=sc.nextLine();
					username=sc.nextLine();
					password=sc.nextLine();
					System.out.println(name+division+username+password);
					Manager mm=new Manager();
					mm.setName(name);
					mm.setDivision(division);
					mm.setUserName(username);
					mm.setPassWord(password);
					ar3.add(mm);
					
					
					break;
				}
			
				 
				
				// main switch case for customer ,managar and registor
				break;
			}
			

		} while (true);

	}

}
