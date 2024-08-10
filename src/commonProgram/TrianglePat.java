package commonProgram;

public class TrianglePat {

	public static void main(String[] args) {
		
		
		for(int i=1;i<14;i++)
		{ 
			for(int j=1;j<20;j++)
			{
				
				if(j>13-i&& j<13+i&&i<8)
				{
					System.out.print("*");
				}else if(i>7&&j>=i&&j<27-i) {
				System.out.print("*");
				}else 
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
			
		}
		
		
		
	}
	
}
