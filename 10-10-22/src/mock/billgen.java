package mock;

import java.util.Scanner;

public class billgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought:");
		int a= sc.nextInt();
		System.out.println("Enter the no of puffs bought:");
		int b= sc.nextInt();
		System.out.println("Enter the no of cool drinks bought:");
		int c= sc.nextInt();
		System.out.println("Bill Details");
		System.out.println("No of pizzas:"+a);
		System.out.println("No of puffs:"+b);
		System.out.println("No of cooldrinks:"+c);
		System.out.println("Total price="+((a*100)+(b*20)+(c*10)));
		System.out.println("ENJOY THE SHOW!!!");
	}
	}


