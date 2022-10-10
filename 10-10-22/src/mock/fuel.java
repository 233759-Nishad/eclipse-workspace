package mock;
import java.util.Scanner;

public class fuel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no of liters to fill the tank");
			int a= sc.nextInt();
			System.out.println("Enter the distance covered");
			int b= sc.nextInt();
			if(a<1)
			{
			System.out.println(a+"is invalid output");
			System.exit(0);
			}
			if(b<1)
			{
			System.out.println(b+"is invalid output");
			System.exit(0);
			}
			if(a>=0 && b>=0){System.out.println("Liters/100KM");
			double c=(a/(double)b)*100;
			System.out.printf("%.2f\n",c);			
			System.out.println("Miles/gallons");
			System.out.println( String.format("%.2f",(b*0.6214/(a*0.2642))));
		}
		}
		
		}
	}


