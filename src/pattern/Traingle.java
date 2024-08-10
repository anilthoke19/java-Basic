package pattern;
public class Traingle {
	
	public static void main(String[] args) {
		
//		for(int i=0;i<5;i++)
//		{
//			int flag=1,count =1;
//			for(int j=0;j<10;j++)
//			{
//				if(j>=5-i&&j<=5+i&&flag==1)
//				{
//					System.out.print(j);
//					flag=0;
//				}else
//				{
//					System.out.print(" ");
//					flag=1;
//				}
//				
//			}
//			System.out.println();
//		}
//		
		
		
		String a="sunil";
		String b="sunil";
		String c=new String("sunil");
		String d=new String("sunil");
		
		System.out.println((a==b)+" "+(a==c)+" "+(a.compareTo(c)));
		System.out.println(a.equals(d));
		System.out.println(System.identityHashCode(a)+" "+System.identityHashCode(b));
	    System.out.println(c.compareTo(a));
		
		
		
		
		
	}

}
