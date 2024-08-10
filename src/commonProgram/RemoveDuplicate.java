package commonProgram;

public class RemoveDuplicate {
	public static void main(String[] args) {
		
		int[] a=new int[] {1,2,6,1,3,4,5,6,6,1,1};
		
		int i,j,count=0;

			for(i=0;i<a.length-1;i++)
			{
				for(j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			int len=a.length;
			for(i=0;i<len-1;i++)
			{
				
				if(a[i]==a[i+1])
				{
				for(j=i;j<len-1;j++)
				{
					a[j]=a[j+1];
				}
				i--;
				len--;
					
				}
			}
			
			
			//a[i]=a[i+1];
			for(i=0;i<len;i++) {
		System.out.println(a[i]);
			}
		
	}

}
