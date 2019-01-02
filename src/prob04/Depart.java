package prob04;

public class Depart extends Employee {
	
	private String department;

	public Depart() {
		this(null, 0, null);
	}
	
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void getInformation() {
		System.out.print(
				"이름: " + getName() + "\t" +
				"연봉: " + getSalary() + "\t" +
				"부서: " + department
		);
	}
	
}
