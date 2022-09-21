package hackathon;

import java.util.Scanner;

public class ngtvpstv {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Please enter the Number");
        int x=s.nextInt();
        if(x<0)
        {
            System.out.println("The given number '"+x+"' is a Negative Number");
        }
        else if(x>0)
        {
            System.out.println("The given number '"+x+"' is a Positive Number");
        }
        else
        {
            System.out.println("The given number '"+x+"' is a neither positive or Negative Number");
        }
	}
}
