package ustdemo;

class Parent{
	void show() {
		System.out.println("This is Parent Class");
	}
}
class Child extends Parent
{
	void show() {
		System.out.println("This is Child Class");
	}
}
public class CPCALL {

	public static void main(String[] args) {
		Parent P=new Parent();
		Child C=new Child();
		Parent D=new Child();
		P.show();
		C.show();
		D.show();
		
	}

}
