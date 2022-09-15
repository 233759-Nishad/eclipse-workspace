package ustdemo;
class Member
{
	String name;
	int age,phno,salary;
	String address;
	void printSalary()
	{
		System.out.println("Enter the salary");
	}
	void show()
	{
		System.out.println(name+" "+age+" "+phno+" "+address+" "+salary+" ");
	}
}



class Employee extends Member
{
	String specialisation;
}

class Manager extends Member
{
	String department;
}

public class inheritence {
 public static void main(String[] args)
 {
	Employee e=new Employee();
	e.name="A";
	e.age=25;
	e.phno=1234567891;
	e.salary=25000;
	e.address="xyz"; 
	e.show();
	
	Manager m=new Manager();
	e.name="B";
	e.age=75;
	e.phno=1234654891;
	e.salary=34565;
	e.address="hgf"; 
	e.show();
 }
 
	
}
