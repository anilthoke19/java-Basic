package objectClassMethod;

class CloneMotho implements Cloneable
{
	int id ,price;
	String name;
	
void add(String name,int id,int price)
{
	this.id=id;
	this.name=name;
	
}
void show()
{
	System.out.println(id+" "+name);
}







	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMotho p=new CloneMotho();
		
		p.add("sds", 1, 2);
		p.show();
		CloneMotho p2=(CloneMotho)p.clone();
		p2.show();
		p2.add("fff", 10, 10);
		p2.show();
		p.show();
	
		
		
	}

}
