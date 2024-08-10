package constructorr;


class Product {
	int id,price;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class ProductData
{
	public ProductData(Product p) {
		
			System.out.println(p.getId());
                    System.out.println(p.getName());
//			this.name=p.getName();
//			
		
	}
	
	
}


public class ObjectPassing {
public static void main(String[] args) {
	Product p=new Product();
	p.setId(100);
	p.setName("anil");
	
	ProductData k=new ProductData(p);

	
	
}
	
	
}
