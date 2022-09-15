package day4;

public class exp2 {
	 
	public static void main(String argvs[])  
	{  
		try {
			int a=100/0;
			System.out.println(a);
		}catch (Exception e) {
			System.out.println("Arithmetic exception occured");
		}
	}
}
