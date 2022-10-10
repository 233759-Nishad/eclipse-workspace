package mock;

import java.util.Scanner;

public class strngconcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Inmates's name:");
		String a= sc.nextLine();
		System.out.println("Inmates's Father's name:");
		String b= sc.nextLine();
		a=a.concat(" ").concat(b);
		char[] c=a.toCharArray();
		for(char e:c)
		{
			if(Character.isDigit(e)|| e=='@'|| e=='*'|| e=='#'|| e=='+'|| e=='%'|| e=='$'|| e=='&'|| e=='(')
			{
				System.out.println("Invalid name");
				System.exit(0);
			}
		}
		System.out.println(a.toUpperCase());
		
	}

}
