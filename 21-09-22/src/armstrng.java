import java.util.Scanner;

public class armstrng {
	   public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        int n,r,temp,res=0;
	        System.out.println("enter number");
	        Scanner sc=new Scanner(System.in);
	        n=sc.nextInt();
	        temp=n;
	        while(temp!=0)
	        {
	            r=temp%10;
	            res=res+(r*r*r);
	            temp=temp/10;
 }
	        if(res==n)
	        {
	            System.out.println("armstrong");
	        }
	        else
	        {
	            System.out.println("not armstrong");
	        }

	}
}
