package ustdemo;
import java.util.Scanner;


public class vote {
	public static void main(String[] args) {
		System.out.println("enter the age");
		Scanner s=new Scanner (System.in);
		int a =s.nextInt();
		if(a>=18)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			System.out.println("not eligible for vote");
		}
	}
	
	
}
