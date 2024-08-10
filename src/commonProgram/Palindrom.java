package commonProgram;

public class Palindrom {
	public static void main(String[] args) {
		
		int no=121345,rem=0,rev=0;
		int temp=no;
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		
		System.out.println(rev);
		no=temp;
		if(no==rev)
		{
			System.out.println("number is pelindrome");
		}else
		{
			System.out.println("number is not palindrom");
		}
		
		
		
		
	}

}
