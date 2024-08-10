package org.techhub.helper;
import org.techhub.question.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import org.techhub.onlineexam.*;
import org.techhub.question.Question;

import restaurantApp.Food;

public class OnlineExamHelper {

	int count=0;
	Question q=new Question();
	
		float size;
		ArrayList ar=new ArrayList();
		
		//String question1;
		
		public void addNewQuestion(Question q)
		{
			ar.add(q);
			size=ar.size();
            System.out.println(size);
			
		}
		
		
		public void removeQuestion(int questionId)
		{ 
//			Iterator i=ar.iterator();
//			while(i.hasNext())
//			{
//				Object obj=i.next();
//				Question jk=(Question)obj;
//				
//				if(jk.getId()==questionId)
//				{
//					i.remove();
//				}
//			}
			
			
			
			int flag=0;
			for(Object obj:ar)
			{
				Question q1=(Question)obj;
				//int value=q1.getId();
				if(questionId==q1.getId())
				{
				int index=ar.indexOf(q1);
				System.out.println("index is"+index);
				if(index!=-1){
				ar.remove(index);
				flag=1;
				break;
				}
				}
				if(flag==1) {
					System.out.println("question removed\n");
				}
				
				else
				{
					System.out.println("question not available\n");
				}
			}
		}
		
		
		public void viewAllQuestion()
		{
			
			for(Object obj:ar)
			{
				Question q=(Question)obj;
				System.out.println(q.getName()+" "+q.getId()+" "+q.getOption1()+" "+q.getOption2()+" "+q.getOption3()+" "+q.getOption4()+" "+q.getAnswer());
			//System.out.println(q.getName());
			}
		}
		
		public boolean searchQuestion(String questoinName)
		{
			int flag=0;
			for(Object obj:ar)
			{
				q=(Question)obj;
				
				if(q.getName().equalsIgnoreCase(questoinName))
				{
				flag=1;	
				}
			}
			if(flag==1) {
				System.out.println(q.getName()+" "+q.getId());
				return true;}
			else {
				return false;}	
		}
		
		
		public void attempQuestion(int id,String answerr)
		{
			for(Object obj:ar)
			{
				Question q2=(Question)obj;
				
				if(q2.getId()==id&&q2.getAnswer().endsWith(answerr))
				{
					count++;
				}
			}
			 
		}
		
		
		public void showResult()
		{
			float marks=0,grade=0;
			
			
			
		    marks=size-count;
		    
		    grade=(count/size)*100;
		    System.out.println("your correct answer is: "+count);
		    
		    System.out.println("Your wrong answer is: "+marks);
		    
		    System.out.println("Total number of question: "+size);
		    
		    System.out.println("your percentage is: "+grade+"\n");
		    
			
			
		}
	
	
}
