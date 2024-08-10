package fileHandlingg;
import java.io.*;
class Bulb implements Serializable
{
	int price,rating;
	String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}




public class ObjectOutputInFile{
	public static void main(String[] args ) throws Exception{
		Bulb b =new Bulb();
		b.setName("bajaj");
		b.setPrice(200);
		b.setRating(4050);
		
		Bulb b2 =new Bulb();
		b2.setName("bajaj");
		b2.setPrice(200);
		b2.setRating(4055);
		
//	
//		
//		FileOutputStream obj=new FileOutputStream("C:\\FileHandling\\objectt.txt", true);
//		ObjectOutputStream obj2=new ObjectOutputStream(obj);
//		obj2.writeObject(b);
//		obj2.writeObject(b2);

		
		FileInputStream i=new FileInputStream("C:\\FileHandling\\objectt.txt");
		ObjectInputStream om=new ObjectInputStream(i);
		
		Object obj3=om.readObject();
		
		  for(int ii=0;ii<2;ii++) {
		  
		  if(obj3!=null) { Bulb b3=(Bulb)obj3;
		  System.out.println(b3.getName()+" "+b3.getPrice()+" "+b3.getRating());
		  
		  } }
		 
		
		
	

		
			
		
	}

}
