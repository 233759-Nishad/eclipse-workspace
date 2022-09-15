package ustdemo;

import java.util.Scanner;

public class pattern8 {
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		int i,j,n,c=1;
		System.out.print("enter the number of rows:");		
		n = in.nextInt();	
		c=n-1;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=c;j++)
			{
				System.out.print(" ");
			}
			c--;
			for(j=1;j<=2*i-1;j++)
			{
			System.out.print("*");
		}
			System.out.println("");
		}
		c=1;
		for(i=1;i<=n-1;i++)
		{
				
			for(j=1;j<=c;j++)
			{
				System.out.print(" ");
	}

			c++;
			for(j=1;j<=2*(n-i)-1;j++)
			{
			System.out.print("*");
		}
			System.out.println("");
		}
		
	}	
}

