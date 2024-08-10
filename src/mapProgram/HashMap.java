package mapProgram;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

class Player
{
	String name;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	Player (String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	Player (){
		
	}
}


public class HashMap {
public static void main(String[] args) {
	
ArrayList a=new ArrayList();	
LinkedHashMap m=new LinkedHashMap();
a.add("sachin");
a.add("Yuvraj");
a.add("Sehwag");
m.put("India", a);

LinkedHashMap n=new LinkedHashMap();
a.add("Warner");
a.add("jordy");
a.add("matthew");
m.put("aus", a);






}
	
	
	
}
