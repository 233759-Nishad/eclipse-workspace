package awtreg;
interface printable{
	void print();
}
class  I implements printable{
	public void print()
	{
		System.out.println("Hello");
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I obj=new I();
		obj.print();

	}

}
