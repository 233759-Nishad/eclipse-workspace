package ustdemo;
import java.util.Scanner;

public class avg {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
	int a[],i,sum=0;
	float avg;
	a=new int[10];
	System.out.println("Enter ten nmbrs");
	for(i=0;i<10;i++)
	{
		a[i]=s.nextInt();
	}
	for(i=0;i<10;i++)
	{sum=sum+a[i];
	}
	avg=sum/10;
			System.out.println("Average of given ten numbers is " +avg);
	}

}