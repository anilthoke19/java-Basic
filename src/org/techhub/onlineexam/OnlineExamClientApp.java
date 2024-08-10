package org.techhub.onlineexam;
import java.util.*;
import org.techhub.helper.*;
import org.techhub.question.*;

public class OnlineExamClientApp {
	public static void main(String[] args) {
		
		
		int id;
		String name,answer,option1,option2,option3,option4;
		
		Scanner sc=new Scanner(System.in);
		OnlineExamHelper online=new OnlineExamHelper();

		do
		{
		System.out.println(" 1: Add new question");	
		System.out.println("2: Remove question");
		System.out.println("3: View all question ");
		System.out.println("4: Search question by name");
		System.out.println("5: attemp question");
		System.out.println("6: show result");
		
		Question q=new Question();
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			sc.nextLine();
			System.out.println("enter the id");
			id=sc.nextInt();
			q.setId(id);
			sc.nextLine();
			
			System.out.println("enter question");
			name=sc.nextLine();
			q.setName(name);
			
			System.out.println("enter option 1");
			option1=sc.nextLine();
			q.setOption1(option1);
			
			System.out.println("enter option 2");
			option2=sc.nextLine();
			q.setOption2(option2);
			
			System.out.println("enter option 3");
			option3=sc.nextLine();
			q.setOption3(option3);
			
			System.out.println("enter option 4");
			option4=sc.nextLine();
			q.setOption4(option4);
			
			System.out.println("enter the answer");
			answer=sc.nextLine();
			q.setAnswer(answer);
			 
			online.addNewQuestion(q);
			
			
			
			break;
			
		case 2:// Remove specific id question
			
			System.out.println("entr id for remove question");
			int idd=sc.nextInt();
			online.removeQuestion(idd);
			break;
			
		case 3: // view all question
			online.viewAllQuestion();

			
			break;
			
		case 4:
			sc.nextLine();
			System.out.println("enter question for search");
			name=sc.nextLine();
			boolean b=online.searchQuestion(name);
			if(b)
			{
				System.out.println("Question avaiable");
			}else
				System.out.println("question not available");
			break;
		
		case 5:
			System.out.println("enter id");
			 idd=sc.nextInt();
			 sc.nextLine();
			 System.out.println("enter correct answer ");
			 answer=sc.nextLine();
			online.attempQuestion(idd, answer);
			
			break;
			
		case 6:
			System.out.println("Your Result :");
			online.showResult();
			break;
			
			default:
				System.out.println("enter the correct choice");
		}
			
		}while(true);
		
		
		
	}

}
