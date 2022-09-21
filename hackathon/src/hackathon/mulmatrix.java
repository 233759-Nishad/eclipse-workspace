package hackathon;
import java.util.Scanner;

public class mulmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{7,3,5},{5,2,6},{7,7,5}};
		int b[][]= {{8,2,2},{4,5,6},{8,8,0}};
		int c[][]=new int[3][3];
		
		 System.out.println("\nMultiplication of two matrices is:");
	     for(int i=0;i<3;i++)
	     {
	         for(int j=0;j<3;j++)
	         {
	             for(int k=0;k<3;k++)
	             {
	                 
	                   c[i][j]+=a[i][j]*b[i][j];
	             
	         }
	             System.out.print(c[i][j]+" ");
	         
	     }
	         System.out.println();
	     }    
	}

}
