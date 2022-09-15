package ustdemo;

import java.util.Scanner;

public class smallest {
	public static void main(String[] args) {
		System.out.println("enter three numbers");
		Scanner s=new Scanner (System.in);
		int a =s.nextInt();
		int b =s.nextInt();
		int c =s.nextInt();
		if(a<b)
		{
			if(a<c)
			{
			System.out.println("smallest number between given numbers is "+a);
		}
		}
		else if(b<c)
		{
			System.out.println("smallest number between given numbers is "+b);
		}
		else
			{
			System.out.println("smallest number between given numbers is "+c);
			}
}
	
}




