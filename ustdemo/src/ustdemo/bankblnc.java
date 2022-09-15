package ustdemo;

class bank{
	void getBalance() {
		System.out.println(0);
	}
}
class BankA extends bank{
	void getBalance() {
		System.out.println(1000);
	}
}

class BankB extends bank{
	void getBalance() {
		System.out.println(2000);
	}
}
class BankC extends bank{
	void getBalance() {
		System.out.println(3000);
	}
}

public class bankblnc {
	public static void main(String[] args)
	{
	BankA aa = new BankA();
	BankB ba = new BankB();
	BankC ca = new BankC();
	aa.getBalance();
	ba.getBalance();
	ca.getBalance();
}
}
