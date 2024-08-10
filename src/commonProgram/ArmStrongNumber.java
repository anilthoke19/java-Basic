package commonProgram;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		
		int no=500,i,j,count=0,temp,num,rem;
		double sum=0;
		double fact;
		
		for(i=12;i<no;i++)
		{count=0;
			num=i;
			
			while(num!=0)
			{count++;
				num=num/10;
			}
			num=i;
			sum=0;
			fact=0;
			while(num!=0) {
				
				rem=num%10;
			fact=Math.pow(rem,count);
			//System.out.println(fact);
		sum=sum+fact;
			num=num/10;
					
			}
			
			if(sum==i)
			{
				System.out.println(sum);
			}
		}
		
	}

}
