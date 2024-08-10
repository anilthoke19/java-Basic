package commonProgram;

import java.util.Scanner;

class Steel
{
	int id,hardness,tensileStringth;
	int carbon_content;
	
	
	public Steel(int id,int hardness,int tensileStringth,int carbon_content )
	{
		this.id=id;
		this.hardness=hardness;
		this.tensileStringth=tensileStringth;
		this.carbon_content=carbon_content;
	}
	
	public void display() {
		
		System.out.println(id+" "+hardness+" "+tensileStringth+" "+carbon_content);;
	}
	
}

class Quality extends Steel
{
	
	public Quality(int id,int hardness,int tensileStringth,int carbon_content )
	{
		super(id, hardness,tensileStringth,carbon_content);
	}
	public int grade;
	
	void checkGrade()
	{
		if(hardness>=50&&carbon_content>=7&&tensileStringth>=590)
		{
			grade=10;
			//System.out.println(grade);
		} else if(hardness>50&&carbon_content>0.7)
		{
			System.out.println(hardness+" "+tensileStringth+" "+carbon_content);

			grade=9;
			//System.out.println(grade);
		}
		else if(carbon_content>0.7&&tensileStringth>5600)
		{
			grade=8;
			System.out.println(grade);
		}
		else if(hardness>50&&tensileStringth>5600)
		{
			grade=7;
			System.out.println(grade);
		}
		else if(hardness>50)
		{
			grade=6;
			System.out.println(grade);
		}
		else if(hardness<50&&carbon_content<0.7&&tensileStringth <5600)
		{
			grade=5;
			System.out.println(grade);
		}
	}
	
	public void display()
	{
		switch(grade)
		{
		case 10:
			System.out.println("grade is: "+grade+" "+id+" "+hardness+" "+tensileStringth+" "+carbon_content);
			break;
			
		case 9:
			
			System.out.println("grade is: "+grade+" "+id+" "+hardness+" "+tensileStringth+" "+carbon_content);
			break;
			
		case 8:
			System.out.println("grade is: "+grade+" "+id+" "+hardness+" "+tensileStringth+" "+carbon_content);
			break;
			
		case 7:
			System.out.println("grade is: "+grade+" "+id+" "+hardness+" "+tensileStringth+" "+carbon_content);
			break;
			
		case 6:
			System.out.println("grade is: "+grade+" "+id+" "+hardness+" "+tensileStringth+" "+carbon_content);
			break;
			
		case 5:
			System.out.println("grade is: "+grade+" "+id+" "+hardness+" "+tensileStringth+" "+carbon_content);
			break;
		}
	}
	
	
}



public class July3rdQuestion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int id, hardness,tensileStringth;
		int carbon_content;
		
		System.out.println("enter id ,hardness,tensile and carbon");
		id=sc.nextInt();
		hardness=sc.nextInt();
		tensileStringth=sc.nextInt();
		carbon_content=sc.nextInt();
		
		Quality q=new Quality(id, hardness, tensileStringth, carbon_content);
		//Quality q2=new Quality(2, 377, 5, 10);
		
		q.checkGrade();
		q.display();
		
//		q2.checkGrade();
//		q2.display();
	}
	

}
