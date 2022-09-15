package ustdemo;

import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
		Scanner in =new Scanner (System.in);
		int i,j,n,k;
		System.out.print("enter the number of rows:");
		
		n = in.nextInt();
		k=n;
		{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k=k-1;
			}
			k=n;
			System.out.println();
		}

	}
	
		}
}
