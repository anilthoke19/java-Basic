package pdfBySir;
import java.util.*;
class Product 
{
	Scanner sc=new Scanner(System.in);
    LinkedList ar=new LinkedList();
	Product pp;
	
	private int id,quantity,rate,total;
	private String pname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public Product()
	{
		
	}
	
	public Product(String name,int id,int quantity,int rate,int total)
	{
		this.id=id;
		this.pname=name;
		this.quantity=quantity;
		this.rate=rate;
		this.total=total;
		
		
		
	}
	
	Product b[];
	void add(Product p[])
	{
		for(int i=0;i<p.length;i++)
		{
			ar.add(p[i]);
		}
		
	}
	
	
	
	 void findByName()
	 {
		 
		 System.out.println("enter the name product ");
		 String name=sc.nextLine();
		 int flag=0;
		 Product p=null;
		 for(Object obj:ar)
		 {
			 p=(Product)obj;
			 
			 if(name.equalsIgnoreCase(p.getPname()))
			 {
				 //System.out.println(p.getPname()+" "+p.getRate()+""+p.getId()+" ");
				flag=1;
				 break;
			 }
		 }
		 
		 if(flag==1)
		 {
			 System.out.println(p.getPname()+" "+p.getRate()+" "+p.getId()+" ");
 
		 }else {
			 System.out.println("not found");}
		 
	 }
	 
	 void updateById()
	 {
		 System.out.println("enter id for update product");
		 id=sc.nextInt();
		 
		 for(Object obj:ar)
		 {
			 pp=(Product)obj;
			 
			 if(pp.getId()==id)
			 {
				 pp.setPname("laptop");
			 }
		 } 
	 }
	 
	
	 void deleteById()
	 {int index;
		 System.out.println("enter a id for delete");
		 int id=sc.nextInt();
		 for(Object obj:ar )
		 {
			  pp=(Product)obj;
			 
			 if(pp.getId()==id)
			 {
				 
				 index=ar.indexOf(pp);
				 ar.remove(index);
				 break;
				 
			 }
			 
		 }
	 }
	 
	 void deleteByName()
	 {
		 sc.nextLine();
		 System.out.println("enter product name for delete");
		 String name=sc.nextLine();
		 int flag=0;
		 for(Object obj:ar)
		 {
			 pp=(Product)obj;
			 if(pp.getPname().equalsIgnoreCase(name))
			 {
				 int index=ar.indexOf(pp);
				 ar.remove(index);
				 flag=1;
				 break;
			 }
		 }
		 
		 if(flag==1)
		 {
			System.out.println("product removed");
		 }else
			 System.out.println("Product not available for delete");
	 }
	
	void show()
	{
		for(Object t:ar)
		{
			Product c=(Product)t;
			System.out.println(c.getId()+" "+c.getPname()+" "+c.getQuantity());
			
		}
	}
	
	
}


public class Billing {
	public static void main(String[] args) {
		
		Product p[]=new Product[5];
		
		p[0]=new Product("parle",11,5,5,10);
		p[1]=new Product("milk",22,2,25,10);
		 p[2]=new Product("pen",33,5,5,30);
		 p[3]=new Product("Book",44,5,50,5);
		 p[4]=new Product("watch",55,1,555,3);
		 
		 Product c=new Product();
		 c.add(p);
		 c.show();
		// c.findByName();
		 //c.deleteById();
		// c.deleteByName();
		 c.updateById();
		 c.show();

		
	}

}
