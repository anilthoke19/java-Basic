package collectionJava;

public class RemoveDuplicateWord {
	
	int id;
	public RemoveDuplicateWord(int id) {
		super();
		// TODO Auto-generated constructor stub
		
		this.id=id;
	}

	public static void main(String[] args) {
		
		String name="It is the string is it remove word";
		
		String nameSplit[]=name.split(" ");
		
		for(int i=0;i<nameSplit.length;i++) {
		System.out.println(nameSplit[i]);
		}
		
		
		for(int i=0;i<nameSplit.length;i++)
		{
			for(int j=i+1;j<nameSplit.length;j++)
			{
				if(nameSplit[i].equalsIgnoreCase(nameSplit[j]))
				{
					nameSplit[i]=" ";
				}
			}
			
		}
		
		for(int i=0;i<nameSplit.length;i++) {
			System.out.println(nameSplit[i]);
			}
		
		
		
		RemoveDuplicateWord r=new RemoveDuplicateWord(4);
		RemoveDuplicateWord r2=new RemoveDuplicateWord(4);
		
		if(r.equals(r2))
			System.out.println("equal");
		else
			System.out.println("not equal");

		
	}

}
