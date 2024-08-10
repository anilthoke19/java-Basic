package constructorr;

import java.util.Scanner;

public class ChainingConst {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		char a[][]=new char[3][];
		
		a[0]=new char [3];
		a[1]=new char[2];
		a[2]=new char [1];
		
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.next().charAt(i);
			}
		}
		
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
