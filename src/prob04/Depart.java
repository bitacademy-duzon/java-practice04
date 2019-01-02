package prob04;

public class Depart extends Employee {

	private String department;
	
	public Depart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		super.getInformation();
		System.out.println("부서 : " + department);
	}

	

}
