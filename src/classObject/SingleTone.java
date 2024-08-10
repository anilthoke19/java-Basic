package classObject;


public class SingleTone {
	
	
	 private  SingleTone() {
		System.out.println(" 1st method");
	}
	 
	 void add()
	 {
		 System.out.println("method");
	 }

	 public static void main(String[] aj)
	 {
		 SingleTone s=new SingleTone();
		 SingleTone d=new SingleTone();
		 d.add();
		//SingleTon
		s.add();
		 
	 }
}

