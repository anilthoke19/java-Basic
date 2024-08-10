package wrapperClassP;

public class CountWordBySplit {

	void count()
	{
		String name="java is a programming language and ";
		
		String arr[]=name.split(" ");
		System.out.println(arr.length);
		char arrr[]=new char[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			//arrr[i]=arr[i];
			int len=arr[i].length()-1;
			for(int j=0;j<arr[i].length()/2;j++)
			{
				
			char temp=arrr[j];	
			arrr[j]=arrr[len];
			arrr[len]=temp;
			len--; 
			}
		}
		System.out.println(arrr);
		
	}
	
	
	
	public static void main(String[] args) {
		CountWordBySplit t=new CountWordBySplit();
		t.count();
		
	}
}
