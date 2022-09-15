package ustdemo;
import java.util.Scanner; 

public class greatest {
	public static void main(String[] args) {
		System.out.println("enter two numbers");
		Scanner s=new Scanner (System.in);
		int a =s.nextInt();
		int b =s.nextInt();
		if(a>b)
		{
			System.out.println("greatest number between given numbers is "+a);
		}
		else
		{
			System.out.println("greatest number between given numbers is "+b);
}
	}
}
