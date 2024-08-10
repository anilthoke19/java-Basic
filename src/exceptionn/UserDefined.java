package exceptionn;

import java.util.Scanner;

class Product extends ArithmeticException
{
	public String HighPrice()
	{
		return "Price limit is high";
	}
	
	
}

class ProductAction
{
	Scanner sc=new Scanner(System.in);
	int price,value=100;
	void Add() 
	{
	System.out.println("enter price");
	price=sc.nextInt();
	
	if(price>value)
	{
		Product p=new Product();
		throw p;
	}
	
	}
	
	
}

public class UserDefined {
public static void main(String[] args) {
	try
	{
		ProductAction a=new ProductAction();
		a.Add();
		
	}catch(Product t)
	{
		System.out.println(t.HighPrice());;
	}
	
	
}
	
	
	
}
