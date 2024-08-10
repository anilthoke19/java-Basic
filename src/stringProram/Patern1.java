package stringProram;

public class Patern1 {
	
	public static void main(String[] args) {
		
		char s='a';
		
		for(int i=1;i<6;i++)
		{
			int k=1;
			for(int j=1;j<=9;j++)
			{
				if(j>=6-i&&j<=4+i&&k==1)
				{
					
					System.out.print(s);
					s++;
					k=0;
				}else {
					System.out.print(" ");
					k=1;
				}
				 
				
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
