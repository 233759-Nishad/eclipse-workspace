package testing.di;

public class person {

	private String name;
	public person(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	private String department;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void display()
	{
		System.out.println("my self is "+name+" from "+department);
	}
	
	
}
