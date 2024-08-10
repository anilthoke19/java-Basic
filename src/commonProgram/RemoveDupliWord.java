package commonProgram;
import java.util.*;

public class RemoveDupliWord {
public static void main(String[] args) {
	String s="Hello world India world Hello Hello";
	
	String[] n;
	
//System.out.println(s.length());
n=s.split(" ");

//System.out.println(n[0]+" 0 index");
int count=0;
for(int i=0;i<n.length;i++)
{
	for(int j=i+1;j<n.length;j++)
	{
		if(n[i].equalsIgnoreCase(n[j]))
		{
			count++;
			if(i!=j)
			{
				n[j]=" ";
			}
		}
	}
}

System.out.println("Origional String: "+s);

s=" ";
for(int i=0;i<n.length;i++) {
	if(n[i]!=" ")
	{	
		s+=n[i]+" ";
	}
	
//System.out.print(n[i]);
}

System.out.println("After removing dupliacte: "+s);

//
//String h="anil";
//h="sunil";
//System.out.println(h);

}
	

	
}


// Remove duplicate word
/* 
 * package constructorr;
import java.util.*;

class RemoveS
{
	void show() {
	String name="I loveE my India I love ";
	
	char value[]=new char[name.length()];
	int size=name.length();
	
//	for(int i=0;i<name.length();i++)
//	{
//		value[i]=name.charAt(i);
//	}
	
	value=name.toCharArray();
	
	for(int i=0;i<name.length();i++)
	{
		//System.out.println(value[i]);
	}
	
	
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(value[i]==value[j]|| value[i]==value[j]-32|| value[i]==value[j]+32)
			{
				value[j]=' ';
			}
		}
	}
	
	for(int i=0;i<size;i++)
	{
		if(value[i]!=' ' )
		{
			System.out.println(value[i]);
		}
	}
	
	String h=new String(value);
	System.out.println(h);
	
	}
	
	
}

public class HiarchicalChaining {
	public static void main(String[] args) {
		RemoveS s=new RemoveS();
		s.show();

	}
}

 * */
