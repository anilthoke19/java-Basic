package restaurantApp;

import java.util.Scanner;

public class Customer {
	
	private String name;
	private String userName;
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	private int age;
	private String gender;
	private String fFood;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getfFood() {
		return fFood;
	}
	public void setfFood(String fFood) {
		this.fFood = fFood;
	}
	
	
	public Customer()
	{
		
	}
	
	public Customer(String n,String food,String gender,int age)
	{
		name=n;
		fFood=food;
		this.gender=gender;
		this.age=age;
	}
	public void setUserName(String username2) {
		// TODO Auto-generated method stub
		userName=username2;
		
	}

}
