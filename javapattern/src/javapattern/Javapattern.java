package javapattern;

public class Javapattern {

	public Javapattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);	
		}
		for(int k=0;k<2*(5-i);k++)
		{
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);	
		}
		System.out.println();
		}
	} 

}
