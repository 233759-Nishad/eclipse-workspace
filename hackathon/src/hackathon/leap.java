package hackathon;

import java.util.Scanner;

public class leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int year;
        System.out.println("Enter a Year to check: ");
        year=s.nextInt();
        if(( year%4 == 0 && (year%100!=0)) || (year%400==0))
        {
            System.out.println("The given Year is a Leap Year");
        }
        else
        {
            System.out.println("The given Year is not Leap Year");
        }
	}

}
