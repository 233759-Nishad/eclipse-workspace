package ustdemo;
import java.util.Scanner;
public class oddeven {
	public static void main(String[] args) {
		int a,d,i;
		int even=0,odd=0;
		Scanner scan=new Scanner (System.in);
		System.out.println("enter a nmbr: ");
		a=scan.nextInt();
		while(a>0)
		{
			d=a%10;
			if(d%2==0)
			
			{
				even=even+d;
			}
		
		else
		{
			odd=odd+d;
		}
		a=a/10;
	}
		System.out.println("the sum of even digits is "+even);
		System.out.println("the sum of odd digits is "+odd);
		}
}


