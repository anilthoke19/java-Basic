package commonProgram;

import java.util.*;
public class PelindromeString2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String value;
		int flag=1;
		System.out.println("enter the string");
		value=sc.nextLine();
		
		int last=value.length()-1;
		
		
		for(int i=0;i<value.length()/2;i++)
		{
			flag=0;
			
		if(value.charAt(i)==value.charAt(last))
		{
			flag=1;
		}
		else {
			flag=0;
			break;
		}
		last--;
			
		}
		
		if(flag==0)
		{
			System.out.println("String is not palindorme");
		}else
		{
			System.out.println("String palindrrome");
		}
		
	}

}
