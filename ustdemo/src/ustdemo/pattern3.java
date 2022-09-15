package ustdemo;

public class pattern3 {
	public static void main(String[] args) {
		int i,j;
		for(i=8;i>0;i--)
		{	
			if(i%2==0)
			{
			for(j=1;j<i;j++)
			{
				while(j%2==0)
					System.out.print(" ");
				if(j%2==0)
				{
				System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
			}
			System.out.println("");
			}
		}
	}
}
