package classObject;

import java.util.Scanner;

class Vehicle 
{
	int id;
	String name;
	int price;
	
	public void set(int id)
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
	public String getName()
	{
		return name;
	}
	
	public void Setprice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
}


class VehicaleData
{
	int i;
	Vehicle vehi[];
	
	public void setVehicleData(Vehicle  vehi[])
	{
		this.vehi=vehi;
		
	}
	
	public Vehicle getVehicleData(int price)
	{
		
		boolean flag=false;
		for(i=0;i<vehi.length;i++) {
		if(vehi[i].getPrice()>price)
		{
			flag=true;
			break;
		}
		}
if(flag==true)
{
	return vehi[i];
}else {
	return null;}
		
	}
	
	
}


public class VehicleApp {
	public static void main(String[] arsg)
	{
		int id,price;
		String name;
		
		Vehicle[] v=new Vehicle[3];
		
		for(int i=0;i<v.length;i++)
		{
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter name,id and price");
			name=sc.nextLine();
			id=sc.nextInt();
			price=sc.nextInt();
			v[i]=new Vehicle();
			v[i].setName(name);
			v[i].set(id);
			v[i].Setprice(price);
		}
		Scanner sc=new Scanner(System.in);

		VehicaleData a=new VehicaleData();
		a.setVehicleData(v);
		System.out.println("enter your vehicle price");
		int pricee=sc.nextInt();
		
		Vehicle vv;
		vv=a.getVehicleData(pricee);
		if(vv!=null)
		System.out.println(vv.getName()+vv.getId()+" "+ vv.getPrice());
		
		
		
	}
	

}
